/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.service;

import org.springframework.stereotype.Service;
import za.co.labournet.taxcalculator.dto.CalculatorInputDto;
import za.co.labournet.taxcalculator.dto.CalculatorOutputDto;
import za.co.labournet.taxcalculator.model.UserTaxVariableModel;
import za.co.labournet.taxcalculator.util.UserProfileBuilder;

/**
 *
 * @author omphilebonolomonale
 */
@Service
public class CalculatorService {
    
    public CalculatorService() {
    }
    
    public CalculatorOutputDto calculatePaye(UserTaxVariableModel userTaxProfile){
        
        if(userTaxProfile==null){
            //Not taxable
            return new CalculatorOutputDto(0,0,0,0);
        }
        double payeRaw = this.getPayeRaw(userTaxProfile);
        double taxCredit = userTaxProfile.getTaxRebatesModel();
        double paye = payeRaw-taxCredit;
        double netPay = userTaxProfile.getTotalEarnings()-paye;
        
        return new CalculatorOutputDto(payeRaw,taxCredit,paye,netPay);
        
        
    }
    
    private double getPayeRaw(UserTaxVariableModel userTaxProfile){
        
        double taxableAmount = userTaxProfile.getTotalEarnings()
                -userTaxProfile.getTaxableIncomeModel().getTaxableFrom();
        
        double taxPercent = taxableAmount
                *(userTaxProfile.getTaxableIncomeModel().getTaxableRate()/100);
        
        return taxPercent + userTaxProfile.getTaxableIncomeModel().getBaseAmount();
    }
    
}
