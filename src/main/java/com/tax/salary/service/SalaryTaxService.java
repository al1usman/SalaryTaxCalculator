package com.tax.salary.service;

import com.tax.salary.entity.SalaryTax;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryTaxService {
    @Autowired
    private KieContainer kieContainer;

    public SalaryTax getTax(SalaryTax salaryTax) {
        KieSession kieSession = kieContainer.newKieSession();
        salaryTax.setYearlySalary(salaryTax.getMonthlySalary() * 12);
        kieSession.insert(salaryTax);
        kieSession.fireAllRules();
        salaryTax.setYearlySalaryAfterTax(salaryTax.getYearlySalaryAfterTax());
        salaryTax.setYearlyTax(((salaryTax.getTaxableAmount() * salaryTax.getSalaryTaxPercentage() / 100)) + salaryTax.getFixedAmount());
        salaryTax.setYearlySalaryAfterTax(salaryTax.getYearlySalary() - salaryTax.getYearlyTax());
        salaryTax.setMonthlyTax(salaryTax.getYearlyTax() / 12);
        salaryTax.setMonthlySalaryAfterTax(salaryTax.getYearlySalaryAfterTax() / 12);
        kieSession.dispose();
        return salaryTax;
    }

}
