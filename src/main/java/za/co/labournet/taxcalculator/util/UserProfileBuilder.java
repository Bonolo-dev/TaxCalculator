/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.util;

import java.util.List;
import org.springframework.stereotype.Component;
import za.co.labournet.taxcalculator.dto.CalculatorInputDto;
import za.co.labournet.taxcalculator.model.MedicalAidTaxCreditModel;
import za.co.labournet.taxcalculator.model.TaxRebatesModel;
import za.co.labournet.taxcalculator.model.TaxThresholdModel;
import za.co.labournet.taxcalculator.model.TaxableIncomeModel;
import za.co.labournet.taxcalculator.model.UserTaxVariableModel;


/**
 *
 * @author omphilebonolomonale
 */

public class UserProfileBuilder {
    
    private CalculatorInputDto userData;
    private TaxData taxData;
    
    private UserTaxVariableModel userProfile;
    
    public UserProfileBuilder(CalculatorInputDto userData,TaxData taxData) {
        
        this.userData = userData;
        this.taxData=taxData;
        this.getUserTaxProfile();
    }
    
    private void getUserTaxProfile(){
        
        switch(userData.getTaxYear()){
            case 2021:
                
                this.build2021Profile();
                
                break;
                
            case 2020:
                this.build2020Profile();
        }
            
    }
    
    private TaxableIncomeModel taxableIncomeSearch(
            List<TaxableIncomeModel> incomeTable,double income){
            
        TaxableIncomeModel result=null;
        
        for(TaxableIncomeModel taxLevel: incomeTable){
                
            if(income < taxLevel.getRange()){

                result = taxLevel;   
                break;
            }    
        }
        return result;
    }
    
    private double taxRebateSearch(TaxRebatesModel rebate,int age){
        
        double result;
        
        if(age < 65){
            result = rebate.getPrimary();
        }
        else if(age < 75){
            result = rebate.getSecondary();
        }else{
            result = rebate.getTertiary();
        }
        
        return result;
        
    }
    
    private boolean isTaxable(TaxThresholdModel threshold,double totalEarnings, int age){
        
        boolean result = true;
        
        if(age < 65){
            if(totalEarnings < threshold.getBelow65()){
                result = false;
            }
        }
        else if(age < 75){
            if(totalEarnings < threshold.getMedium()){
                result = false;
            }
        }else{
            if(totalEarnings < threshold.getAbove75()){
                result = false;
            }
        }
        return result;
    }
    
    private void build2021Profile(){
        
        if(!this.isTaxable(this.taxData.getTaxThreshold2021()
                , this.userData.getTotalEarnings(),this.userData.getAge())){
            return;
                   
        }
                
        TaxableIncomeModel incomeLevel =
                this.taxableIncomeSearch(taxData.getTaxableIncome2021()
                ,this.userData.getTotalEarnings());

        double taxRebate = this.taxRebateSearch(
                taxData.getTaxRebates2021(),userData.getAge());
        
        MedicalAidTaxCreditModel medicalAidCredit =
                taxData.getMedicalAidCredit2021();

        this.userProfile = new UserTaxVariableModel(incomeLevel,taxRebate
                ,medicalAidCredit);
    }
    
    private void build2020Profile(){
        
        if(!this.isTaxable(this.taxData.getTaxThreshold2020()
                        , this.userData.getTotalEarnings()
                        ,this.userData.getAge())){
                    
                    //return null;
                }
                
                TaxableIncomeModel incomeLevel =
                        this.taxableIncomeSearch(taxData.getTaxableIncome2020()
                        ,this.userData.getTotalEarnings());
                
                double taxRebate = this.taxRebateSearch(
                        taxData.getTaxRebates2020(),userData.getAge());
                
                
                //MedicalAid now
                MedicalAidTaxCreditModel medicalAidCredit =
                        taxData.getMedicalAidCredit2020();
                
                userProfile = new UserTaxVariableModel(incomeLevel,taxRebate
                        ,medicalAidCredit);
    }
    
    public UserTaxVariableModel getUserProfile(){
        return this.userProfile;
    }
}
