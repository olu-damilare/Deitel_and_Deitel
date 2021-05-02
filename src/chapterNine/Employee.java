package chapterNine;

import java.util.*;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Calendar dateOfBirth;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Calendar dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return  "First Name = " + getFirstName() + '\n' +
                "Last Name = " + getLastName() + '\n' +
                "Social Security Number = " + getSocialSecurityNumber() + '\n';
    }

    public abstract double calculateEarning();

    public int getYearOfBirth(){
        return dateOfBirth.get(Calendar.YEAR);
    };

    public int getMonthOfBirth(){
        return dateOfBirth.get(Calendar.MONTH);
    }

    public int getDayOfBirth(){
     return dateOfBirth.get(Calendar.DAY_OF_MONTH);
    }

    public Calendar getDateOfBirth(){
        return dateOfBirth;
    };
}
