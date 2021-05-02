package chapterNine;

import java.util.Calendar;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double wagePerHour;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double wagePerHour, Calendar dateOfBirth) {
        super(firstName, lastName, socialSecurityNumber, dateOfBirth);
        validateHoursWorked(hoursWorked);
        validateWagePerHour(wagePerHour);
        this.hoursWorked = hoursWorked;
        this.wagePerHour = wagePerHour;
    }

    private void validateWagePerHour(double wagePerHour) {
        if(wagePerHour < 0)
            throw new IllegalArgumentException("Invalid value for wage per hours worked");
    }

    private void validateHoursWorked(double hoursWorked) {
        if(hoursWorked < 0 || hoursWorked > 168)
            throw new IllegalArgumentException("Invalid value for hours worked");
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    @Override
    public double calculateEarning() {
        if(getHoursWorked() > 40)
           return ((getHoursWorked() - 40) * 1.5 + 40) * getWagePerHour();
        else
        return getHoursWorked() * getWagePerHour();
    }

    public void setHoursWorked(double hoursWorked) {
        validateHoursWorked(hoursWorked);
        this.hoursWorked = hoursWorked;
    }

    public void setWagePerHour(double wagePerHour) {
        validateWagePerHour(wagePerHour);
        this.wagePerHour = wagePerHour;
    }
}
