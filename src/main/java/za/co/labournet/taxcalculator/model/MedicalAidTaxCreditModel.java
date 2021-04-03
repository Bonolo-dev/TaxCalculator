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
public class MedicalAidTaxCreditModel {
    
    private double taxPayerRebate;
    private double firstDependantRebate;
    private double dependantRebate;

    public MedicalAidTaxCreditModel(double taxPayerRebate, double firstDependantRebate, double dependantRebate) {
        this.taxPayerRebate = taxPayerRebate;
        this.firstDependantRebate = firstDependantRebate;
        this.dependantRebate = dependantRebate;
    }

    public double getTaxPayerRebate() {
        return taxPayerRebate;
    }

    public void setTaxPayerRebate(double taxPayerRebate) {
        this.taxPayerRebate = taxPayerRebate;
    }

    public double getFirstDependantRebate() {
        return firstDependantRebate;
    }

    public void setFirstDependantRebate(double firstDependantRebate) {
        this.firstDependantRebate = firstDependantRebate;
    }

    public double getDependantRebate() {
        return dependantRebate;
    }

    public void setDependantRebate(double dependantRebate) {
        this.dependantRebate = dependantRebate;
    }
    
    
    
    
}
