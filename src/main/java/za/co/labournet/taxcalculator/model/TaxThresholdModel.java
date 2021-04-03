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
public class TaxThresholdModel {
    
    private double below65;
    private double medium;
    private double above75;

    public TaxThresholdModel(double below65, double medium, double above75) {
        this.below65 = below65;
        this.medium = medium;
        this.above75 = above75;
    }

    public double getBelow65() {
        return below65;
    }

    public void setBelow65(double below65) {
        this.below65 = below65;
    }

    public double getMedium() {
        return medium;
    }

    public void setMedium(double medium) {
        this.medium = medium;
    }

    public double getAbove75() {
        return above75;
    }

    public void setAbove75(double above75) {
        this.above75 = above75;
    }
    
    
    
}
