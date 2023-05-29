package com.tax.salary.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalaryTax {
    private double salaryTaxPercentage;
    private long monthlySalary;
    private long monthlyTax;
    private long monthlySalaryAfterTax;
    private long yearlySalary;
    private long yearlyTax;
    private long yearlySalaryAfterTax;
    private long taxableAmount;
    private long fixedAmount;
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
