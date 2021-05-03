package chapterNine;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void testThatCommissionEmployeeIsATypeOfEmployee(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.NOVEMBER, 23);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Joe", "Doe", "123456789", 100000, 15, dateOfBirth);
        assertEquals("Joe", commissionEmployee.getFirstName());
        assertEquals("Doe", commissionEmployee.getLastName());
        assertEquals("123456789", commissionEmployee.getSocialSecurityNumber());
        assertEquals(100000, commissionEmployee.getGrossSales());
        assertEquals(15, commissionEmployee.getCommissionRate());
    }

    @Test
    void testThatCommissionEmployeeHasAnEarning(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.NOVEMBER, 23);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Joe", "Doe", "123456789", 100000, 15, dateOfBirth);
        assertEquals(15000, commissionEmployee.calculatePaymentAmount());
    }

    @Test
    void testThatBasePlusCommissionEmployeeIsATypeOfCommissionEmployee(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.NOVEMBER, 23);
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Joe", "Doe", "123456789", 100000, 15, 50000, dateOfBirth);
        assertEquals("Joe", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("123456789", employee.getSocialSecurityNumber());
        assertEquals(100000, employee.getGrossSales());
        assertEquals(15, employee.getCommissionRate());
        assertEquals(50000, employee.getBaseSalary());
    }

    @Test
    void testThatBasePlusCommissionEmployeeHasAnEarning(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.NOVEMBER, 23);
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Joe", "Doe", "123456789", 100000, 15, 50000, dateOfBirth);
        assertEquals(65000, employee.calculatePaymentAmount());
    }

}
