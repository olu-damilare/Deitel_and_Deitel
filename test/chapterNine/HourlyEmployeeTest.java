package chapterNine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {
    HourlyEmployee employee;
    Calendar dateOfBirth;

    @BeforeEach
    void setUp() {
        dateOfBirth = new GregorianCalendar(1984, Calendar.NOVEMBER, 23);
        employee = new HourlyEmployee("Joe", "Doe", "123456789", 40, 100, dateOfBirth);

    }

    @Test
    void TestThatHourlyEmployeeIsATypeOfEmployee(){
        assertEquals("Joe", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("123456789", employee.getSocialSecurityNumber());
        assertEquals(40, employee.getHoursWorked());
        assertEquals(100, employee.getWagePerHour());
    }
    @Test
    void TestThatHourlyEmployeeEarningCanBeCalculated(){
        assertEquals(4000, employee.calculatePaymentAmount());
    }
    @Test
    void TestThatHoursWorkedCanBeUpdated(){
        assertEquals(4000, employee.calculatePaymentAmount());
        employee.setHoursWorked(38);
        assertEquals(3800, employee.calculatePaymentAmount());
    }
    @Test
    void TestThatWageCanBeUpdated(){
        assertEquals(4000, employee.calculatePaymentAmount());
        employee.setWagePerHour(150);
        assertEquals(6000, employee.calculatePaymentAmount());
    }

    @Test
    void TestThatHourlyEmployeeCanEarnABonusForHoursGreaterThanForty(){
        HourlyEmployee employee = new HourlyEmployee("John", "Doe", "123456789", 41, 100, dateOfBirth);
        assertEquals(4150, employee.calculatePaymentAmount());
    }
}
