/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.dto;

/**
 *
 * @author omphilebonolomonale
 */
    public class CalculatorOutputDto {
    
    private double payeRaw;
    private double taxCredit;
    private double paye;
    private double netPay;

    public CalculatorOutputDto() {
    }

    public CalculatorOutputDto(double payeRaw, double taxCredit, double paye, double netPay) {
        this.payeRaw = payeRaw;
        this.taxCredit = taxCredit;
        this.paye = paye;
        this.netPay = netPay;
    }

    public double getPayeRaw() {
        return payeRaw;
    }

    public void setPayeRaw(double payeRaw) {
        this.payeRaw = payeRaw;
    }

    public double getTaxCredit() {
        return taxCredit;
    }

    public void setTaxCredit(double taxCredit) {
        this.taxCredit = taxCredit;
    }

    public double getPaye() {
        return paye;
    }

    public void setPaye(double paye) {
        this.paye = paye;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
}
