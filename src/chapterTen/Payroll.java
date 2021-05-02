package chapterTen;

import chapterNine.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.List;

public class Payroll {
    List<Employee> employees = new ArrayList<>();
    public Payroll(Employee... employees) {
        this.employees.addAll(Arrays.asList(employees));
    }

    public double calculateEarning(Employee employee) {
        LocalDateTime date = LocalDateTime.now();
        if(employee.getMonthOfBirth() == date.getMonthValue() - 1)
            return employee.calculateEarning() + 100;
        else
        return employee.calculateEarning();
    }

    public int getTotalNumberOfEmployees() {
        return employees.size();
    }

}
