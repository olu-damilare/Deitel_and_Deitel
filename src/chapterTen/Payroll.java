package chapterTen;

import chapterNine.BasePlusCommissionEmployee;
import chapterNine.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.List;

public class Payroll {
    List<Payable> payable = new ArrayList<>();
    public Payroll(Payable... payable) {
        this.payable.addAll(Arrays.asList(payable));
    }

    public double calculatePayments(Payable payable) {
        LocalDateTime date = LocalDateTime.now();
        if (payable instanceof BasePlusCommissionEmployee && ((Employee) payable).getMonthOfBirth() == date.getMonthValue() - 1)
            return 100 + (1.10 * ((BasePlusCommissionEmployee) payable).getBaseSalary()) + (((BasePlusCommissionEmployee) payable).getCommissionRate()/100) * ((BasePlusCommissionEmployee) payable).getGrossSales();
        if (payable instanceof BasePlusCommissionEmployee)
            return (1.10 * ((BasePlusCommissionEmployee) payable).getBaseSalary()) + (((BasePlusCommissionEmployee) payable).getCommissionRate()/100) * ((BasePlusCommissionEmployee) payable).getGrossSales();
        if (payable instanceof Employee)
            if (((Employee) payable).getMonthOfBirth() == date.getMonthValue() - 1)
                return payable.calculatePaymentAmount() + 100;

        return payable.calculatePaymentAmount();

    }

    public int getTotalNumberOfPayable() {
        return payable.size();
    }

    public Payable calculatePaymentAmount(int i) {
        return payable.get(i);
    }
}
