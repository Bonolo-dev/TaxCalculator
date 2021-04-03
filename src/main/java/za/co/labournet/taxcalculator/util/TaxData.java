/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.util;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import za.co.labournet.taxcalculator.model.MedicalAidTaxCreditModel;
import za.co.labournet.taxcalculator.model.TaxRebatesModel;
import za.co.labournet.taxcalculator.model.TaxThresholdModel;
import za.co.labournet.taxcalculator.model.TaxableIncomeModel;


/**
 *
 * @author omphilebonolomonale
 */
@Component
public class TaxData {
    
    /**
     * This could be any data source
     */
    
    private final List<TaxableIncomeModel> taxableIncome2021 = Arrays.asList(
            new TaxableIncomeModel(205900,0,18,0)
            ,new TaxableIncomeModel(321600,37062,26,205900)
            ,new TaxableIncomeModel(445100,67144,31,321600)
            ,new TaxableIncomeModel(584200,105429,36,445100)
            ,new TaxableIncomeModel(744800,155505,39,584200)
            ,new TaxableIncomeModel(1577300,218139,41,744800)
            ,new TaxableIncomeModel(Double.MAX_VALUE,559464,45,1577300)
    );
    
    private final List<TaxableIncomeModel> taxableIncome2020 = Arrays.asList(
            new TaxableIncomeModel(195850,0,18,0)
            ,new TaxableIncomeModel(305850,35235,26,195850)
            ,new TaxableIncomeModel(423300,63853,31,305850)
            ,new TaxableIncomeModel(555600,100263,36,423300)
            ,new TaxableIncomeModel(708310,147891,39,555600)
            ,new TaxableIncomeModel(1500000,207448,41,708310)
            ,new TaxableIncomeModel(Double.MAX_VALUE,532041,45,1500000)
    );
    
    
    private final TaxRebatesModel taxRebates2021 = new TaxRebatesModel(14958,8199,2736);
    private final TaxRebatesModel taxRebates2020 = new TaxRebatesModel(14220,7794,2601);
    
    private final TaxThresholdModel taxThreshold2021 = new TaxThresholdModel(83100,128650,143850); 
    private final TaxThresholdModel taxThreshold2020 = new TaxThresholdModel(79000,122300,136750);
    
    private final MedicalAidTaxCreditModel medicalAidCredit2021 = new MedicalAidTaxCreditModel(319,319,215);
    private final MedicalAidTaxCreditModel medicalAidCredit2020 = new MedicalAidTaxCreditModel(310,310,209);
    
    public TaxData() {
        
    }

    public List<TaxableIncomeModel> getTaxableIncome2021() {
        return taxableIncome2021;
    }

    public List<TaxableIncomeModel> getTaxableIncome2020() {
        return taxableIncome2020;
    }

    public TaxRebatesModel getTaxRebates2021() {
        return taxRebates2021;
    }

    public TaxRebatesModel getTaxRebates2020() {
        return taxRebates2020;
    }

    public TaxThresholdModel getTaxThreshold2021() {
        return taxThreshold2021;
    }

    public TaxThresholdModel getTaxThreshold2020() {
        return taxThreshold2020;
    }

    public MedicalAidTaxCreditModel getMedicalAidCredit2021() {
        return medicalAidCredit2021;
    }

    public MedicalAidTaxCreditModel getMedicalAidCredit2020() {
        return medicalAidCredit2020;
    }
    
    
    
    
    
    
    
    
}
