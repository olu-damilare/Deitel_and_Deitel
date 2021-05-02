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

    @Override
    public double calculateEarning() {
        return weeklyWage;
    }

    @Override
    public String toString() {
        return  "Weekly Wage = " + weeklyWage;
    }
}
