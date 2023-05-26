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
}
