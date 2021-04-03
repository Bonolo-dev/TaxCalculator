/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.labournet.taxcalculator.dto.CalculatorInputDto;
import za.co.labournet.taxcalculator.dto.CalculatorOutputDto;
import za.co.labournet.taxcalculator.model.UserTaxVariableModel;
import za.co.labournet.taxcalculator.service.CalculatorService;
import za.co.labournet.taxcalculator.util.EarningsPeriodType;
import za.co.labournet.taxcalculator.util.TaxData;
import za.co.labournet.taxcalculator.util.UserProfileBuilder;

/**
 *
 * @author omphilebonolomonale
 */
@RestController
public class CalculatorController {
    
    @Autowired
    TaxData taxData;
    
    @Autowired
    CalculatorService calculatorService;
    
    private final int ANNUAL_MONTHS = 12;
    
    @PostMapping("/calculate")
    public ResponseEntity<?> calculator(@RequestBody CalculatorInputDto userData) throws JsonProcessingException{
    
        ObjectMapper mapper = new ObjectMapper();
        
        double annualEarnings =
                userData.getEarningsType()==EarningsPeriodType.MONTHLY
                ?userData.getTotalEarnings()*ANNUAL_MONTHS
                :userData.getTotalEarnings();
        
        userData.setTotalEarnings(annualEarnings);
        
        
        UserProfileBuilder userProfile = new UserProfileBuilder(userData,taxData);
        
        CalculatorOutputDto calculatedTax = 
                calculatorService.calculatePaye(userProfile.getUserProfile());
        
        
        
        return ResponseEntity.status(HttpStatus.OK).body(mapper.writeValueAsString(calculatedTax));
    }
}
