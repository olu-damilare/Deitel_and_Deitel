package chapterTen;

import chapterNine.BasePlusCommissionEmployee;
import chapterNine.CommissionEmployee;
import chapterNine.Employee;
import chapterNine.HourlyEmployee;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayrollModificationTest {

    @Test
    void testThatSalariedEmployeeIsATypeOfEmployee(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.JULY, 12);
        SalariedEmployee employee = new SalariedEmployee("Joe", "Doe", "123456789", 2000, dateOfBirth);
        assertEquals("Joe", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("123456789", employee.getSocialSecurityNumber());
        assertEquals(2000, employee.calculateEarning());
        assertEquals(1984, employee.getYearOfBirth());
        assertEquals(Calendar.JULY, employee.getMonthOfBirth());
        assertEquals(12, employee.getDayOfBirth());
        assertEquals(dateOfBirth, employee.getDateOfBirth());
    }

    @Test
    void testThatPayrollOfEmployeesCanBeCalculated(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.JULY, 12);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Doe", "123456789", 2000, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1990, Calendar.AUGUST, 12);
        Employee hourlyEmployee = new HourlyEmployee("Joe", "Doe", "123456789", 40, 100, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1995, Calendar.MARCH, 2);
        Employee commissionEmployee = new CommissionEmployee("Joe", "Doe", "123456789", 100000, 15, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1988, Calendar.SEPTEMBER, 30);
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Joe", "Doe", "123456789", 100000, 15, 50000, dateOfBirth);

        Payroll payroll = new Payroll(salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee);
        assertEquals(4, payroll.getTotalNumberOfEmployees());
        assertEquals(2000, payroll.calculateEarning(salariedEmployee));
        assertEquals(4000, payroll.calculateEarning(hourlyEmployee));
        assertEquals(15000, payroll.calculateEarning(commissionEmployee));
        assertEquals(65000, payroll.calculateEarning(basePlusCommissionEmployee));

    }

    @Test
    void testThatEmployeeWhoseBirthMonthIsCurrentMonthReceivesABonus(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.JULY, 12);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Doe", "123456789", 2000, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1990, Calendar.AUGUST, 12);
        Employee hourlyEmployee = new HourlyEmployee("Joe", "Doe", "123456789", 40, 100, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1995, Calendar.MAY, 2);
        Employee commissionEmployee = new CommissionEmployee("Joe", "Doe", "123456789", 100000, 15, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1988, Calendar.SEPTEMBER, 30);
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Joe", "Doe", "123456789", 100000, 15, 50000, dateOfBirth);

        Payroll payroll = new Payroll(salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee);
        assertEquals(4, payroll.getTotalNumberOfEmployees());
        assertEquals(2000, payroll.calculateEarning(salariedEmployee));
        assertEquals(4000, payroll.calculateEarning(hourlyEmployee));
        assertEquals(15100, payroll.calculateEarning(commissionEmployee));
        assertEquals(65000, payroll.calculateEarning(basePlusCommissionEmployee));
    }

}
