package chapterTen;

import chapterNine.Employee;

import java.util.Calendar;

public class SalariedEmployee extends Employee {
    private final double weeklyWage;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklyWage, Calendar dateOfBirth) {
        super(firstName, lastName, socialSecurityNumber, dateOfBirth);
        this.weeklyWage = weeklyWage;
    }

    public double calculatePaymentAmount() {
        return weeklyWage;
    }

    @Override
    public String toString() {
        return  "Salaried employee\n" + super.toString() + "Weekly Wage = " + weeklyWage;
    }
}
