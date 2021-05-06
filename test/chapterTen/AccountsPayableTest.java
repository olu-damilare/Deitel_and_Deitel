package chapterTen;

import chapterNine.BasePlusCommissionEmployee;
import chapterNine.CommissionEmployee;
import chapterNine.Employee;
import chapterNine.HourlyEmployee;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsPayableTest {

    @Test
    void testThatInvoiceCanBeGenerated(){
        Invoice invoice = new Invoice("222-225", "Engine", 5, 1000);
        assertEquals("""
                Invoice
                Product Number = 222-225
                Price per Item = 1000.0
                Product Description = Engine
                Quantity = 5
                Amount payable = 5000.0""", invoice.toString());
    }
    @Test
    void testThatQuantityCanBeUpdated(){
        Invoice invoice = new Invoice("222-225", "Engine", 5, 1000);
        assertEquals(5, invoice.getQuantity());
        invoice.setQuantity(7);
        assertEquals(7, invoice.getQuantity());
    }

    @Test
    void testThatPricePerItemCanBeUpdated(){
        Invoice invoice = new Invoice("222-225", "Engine", 5, 1000);
        assertEquals(1000, invoice.getPricePerItem());
        invoice.setPricePerItem(1500);
        assertEquals(1500, invoice.getPricePerItem());
    }

    @Test
    void testThatAmountsForPayableObjectsCanBeObtained(){
        Calendar dateOfBirth = new GregorianCalendar(1984, Calendar.JULY, 12);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Doe", "123456789", 2000, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1990, Calendar.AUGUST, 12);
        Employee hourlyEmployee = new HourlyEmployee("Joe", "Doe", "123456789", 40, 100, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1995, Calendar.MARCH, 2);
        Employee commissionEmployee = new CommissionEmployee("Joe", "Doe", "123456789", 100000, 15, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1988, Calendar.SEPTEMBER, 30);
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Joe", "Doe", "123456789", 100000,15, 50000, dateOfBirth);
        dateOfBirth = new GregorianCalendar(1988, Calendar.SEPTEMBER, 30);
        PieceWorker pieceWorker = new PieceWorker("Joe", "Doe", "123456789", dateOfBirth,1500, 50);
        Invoice invoice1 = new Invoice("222-225", "Engine", 5, 1000);
        Invoice invoice2 = new Invoice("202-825", "Trunk", 2, 500);

        Payroll payroll = new Payroll(invoice1, invoice2, basePlusCommissionEmployee, commissionEmployee, hourlyEmployee, salariedEmployee, pieceWorker);
        assertEquals(2000, payroll.calculatePayments(salariedEmployee));
        assertEquals(4000, payroll.calculatePayments(hourlyEmployee));
        assertEquals(15000, payroll.calculatePayments(commissionEmployee));
        assertEquals(75000, payroll.calculatePayments(pieceWorker));
        assertEquals(5000, payroll.calculatePayments(invoice1));
        assertEquals(1000, payroll.calculatePayments(invoice2));
    }
    @Test
    void testThatEarningOfBasePlusCommissionEmployeeIsIncreased(){
        Calendar dateOfBirth = new GregorianCalendar(1988, Calendar.SEPTEMBER, 30);
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Joe", "Doe", "123456789", 100000,15, 50000, dateOfBirth);
        Payroll payroll = new Payroll(basePlusCommissionEmployee);
        assertEquals(70000, payroll.calculatePayments(basePlusCommissionEmployee));
    }

}
