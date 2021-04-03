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
public class TaxableIncomeModel {
    
    private double range;
    private double baseAmount;
    private double taxableRate;
    private double taxableFrom;

    public TaxableIncomeModel(double range, double baseAmount, double taxableRate, double taxableFrom) {
        this.range = range;
        this.baseAmount = baseAmount;
        this.taxableRate = taxableRate;
        this.taxableFrom = taxableFrom;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public double getTaxableRate() {
        return taxableRate;
    }

    public void setTaxableRate(double taxableRate) {
        this.taxableRate = taxableRate;
    }

    public double getTaxableFrom() {
        return taxableFrom;
    }

    public void setTaxableFrom(double taxableFrom) {
        this.taxableFrom = taxableFrom;
    }
    
    
    
}
