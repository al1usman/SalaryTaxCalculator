package com.tax.salary.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalaryTax {
    private double salaryTaxPercentage;
    private double monthlySalary;
    private double monthlyTax;
    private double monthlySalaryAfterTax;
    private double yearlySalary;
    private double yearlyTax;
    private double yearlySalaryAfterTax;
    private double taxableAmount;
    private double fixedAmount;
    private String taxableSalaryRange;

    public SalaryTax() {
        setDefaultValues();
    }

    // Method to set default values
    public void setDefaultValues() {
        yearlySalary = 0;
        salaryTaxPercentage = 0;
        taxableAmount = 0;
        fixedAmount = 0;
        taxableSalaryRange = "0.0";
    }
}
