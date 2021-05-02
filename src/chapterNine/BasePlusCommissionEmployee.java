package chapterNine;

import java.util.Calendar;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private final double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionsRate, double baseSalary, Calendar dateOfBirth) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionsRate, dateOfBirth);
        if(baseSalary < 0)
            throw new IllegalArgumentException("Invalid base salary amount.");
        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateEarning(){
        return super.calculateEarning() + getBaseSalary();
    }

    @Override
    public String toString() {
        return  super.toString() + '\n' +
                "Base Salary = " + getBaseSalary();
    }
}
