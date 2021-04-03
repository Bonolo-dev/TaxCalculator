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
public class TaxRebatesModel {
    
    private double primary;
    private double secondary;
    private double tertiary;

    public TaxRebatesModel(double primary, double secondary, double tertiary) {
        this.primary = primary;
        this.secondary = secondary;
        this.tertiary = tertiary;
    }

    public double getPrimary() {
        return primary;
    }

    public void setPrimary(double primary) {
        this.primary = primary;
    }

    public double getSecondary() {
        return secondary;
    }

    public void setSecondary(double secondary) {
        this.secondary = secondary;
    }

    public double getTertiary() {
        return tertiary;
    }

    public void setTertiary(double tertiary) {
        this.tertiary = tertiary;
    }
    
    
    
}
