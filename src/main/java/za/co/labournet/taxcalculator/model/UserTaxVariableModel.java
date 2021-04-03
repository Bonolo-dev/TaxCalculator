/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.model;

/**
 *
 * @author omphilebonolomonale
 */
public class UserTaxVariableModel {
    
    private TaxableIncomeModel taxableIncomeModel;
    private double taxRebate;
    private MedicalAidTaxCreditModel medicalAid;
    private double totalEarnings;

    public UserTaxVariableModel() {
    }

    public UserTaxVariableModel(TaxableIncomeModel taxableIncomeModel
            , double taxRebate,MedicalAidTaxCreditModel medicalAid
            ,double totalEarnings) {
        
        this.taxableIncomeModel = taxableIncomeModel;
        this.taxRebate = taxRebate;
        this.medicalAid = medicalAid;
        this.totalEarnings = totalEarnings;
    }

    public TaxableIncomeModel getTaxableIncomeModel() {
        return taxableIncomeModel;
    }

    public void setTaxableIncomeModel(TaxableIncomeModel taxableIncomeModel) {
        this.taxableIncomeModel = taxableIncomeModel;
    }

    public double getTaxRebatesModel() {
        return taxRebate;
    }

    public void setTaxRebatesModel(double taxRebate) {
        this.taxRebate = taxRebate;
    }

    public MedicalAidTaxCreditModel getMedicalAidModel() {
        return medicalAid;
    }

    public void setMedicalAidModel(MedicalAidTaxCreditModel medicalAid) {
        this.medicalAid = medicalAid;
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }
    
    
    
}
