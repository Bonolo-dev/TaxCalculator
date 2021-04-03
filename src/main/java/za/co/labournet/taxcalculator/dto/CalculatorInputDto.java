/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.labournet.taxcalculator.dto;

import za.co.labournet.taxcalculator.util.EarningsPeriodType;

/**
 *
 * @author omphilebonolomonale
 */
public class CalculatorInputDto {
    
    private int taxYear;
    private int age;
    private double totalEarnings;
    private EarningsPeriodType earningsType;
    private int medicalAidDependants;

    public CalculatorInputDto() {
    }
    
    

    public CalculatorInputDto(int taxYear, int age, double totalEarnings
            , EarningsPeriodType earningsType, int medicalAidDependants) {
        this.taxYear = taxYear;
        this.age = age;
        this.totalEarnings = totalEarnings;
        this.earningsType = earningsType;
        this.medicalAidDependants=medicalAidDependants;
    }

    public int getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public EarningsPeriodType getEarningsType() {
        return earningsType;
    }

    public void setEarningsType(EarningsPeriodType earningsType) {
        this.earningsType = earningsType;
    }

    public int getMedicalAidDependants() {
        return medicalAidDependants;
    }

    public void setMedicalAidDependants(int medicalAidDependants) {
        this.medicalAidDependants = medicalAidDependants;
    }
    
    
    
    
    
    
    
}
