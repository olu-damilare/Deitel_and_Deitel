package chapterNine;

import java.util.*;

public class CommissionEmployee  extends Employee{
    private final double grossSales;
    private final double commissionsRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionsRate, Calendar dateOfBirth) {
        super(firstName, lastName, socialSecurityNumber, dateOfBirth);
        validateGrossSales(grossSales);
        validateCommissionsRate(commissionsRate);
        this.grossSales = grossSales;
        this.commissionsRate = commissionsRate;
    }

    private void validateCommissionsRate(double commissionsRate) {
        if(commissionsRate <= 0 || commissionsRate > 100)
            throw new IllegalArgumentException("commissions rate must be greater than zero and less than or equal to 100");
    }

    private void validateGrossSales(double grossSales) {
        if(grossSales < 0)
            throw new IllegalArgumentException("gross sales should not be less than zero");
    }

    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionsRate;
    }

    @Override
    public String toString() {
        return  "Commission employee\n" + super.toString() +
                "Gross Sales = " + getGrossSales() + '\n' +
                "Commissions Rate = " + getCommissionRate();
    }

    @Override
    public double calculatePaymentAmount() {
        return (getCommissionRate() / 100) * getGrossSales();
    }
}
