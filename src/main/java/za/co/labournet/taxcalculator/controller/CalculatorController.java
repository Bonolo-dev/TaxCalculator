/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.labournet.taxcalculator.dto.CalculatorInputDto;
import za.co.labournet.taxcalculator.model.UserTaxVariableModel;
import za.co.labournet.taxcalculator.service.CalculatorService;
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
    
    
    @PostMapping("/calculate")
    public ResponseEntity<?> calculator(@RequestBody CalculatorInputDto userData){
        
       UserProfileBuilder userProfile = new UserProfileBuilder(userData,taxData);
       
       return ResponseEntity.status(HttpStatus.OK)
                .body(userProfile);
    }
    
    
}
