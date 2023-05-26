package com.tax.salary.controller;

import com.tax.salary.entity.SalaryTax;
import com.tax.salary.service.SalaryTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SalaryTaxController {
    @Autowired
    private SalaryTaxService salaryTaxService;

    @GetMapping("/salary-tax-calculator")
    public String showSalaryTaxCalculator(Model model) {
        model.addAttribute("salaryTax", new SalaryTax());
        return "index";
    }

    @PostMapping("/salary-tax-calculator")
    public String calculateTax(@ModelAttribute("salaryTax") SalaryTax salaryTax, Model model) {
        SalaryTax calculatedTax = salaryTaxService.getTax(salaryTax);
        model.addAttribute("salaryTax", calculatedTax);
        return "index";
    }

}

