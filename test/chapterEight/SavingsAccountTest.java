package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {

    @Test
    void testThatSavingsAccountHasAnInterestRate(){
        SavingsAccount.modifyAnnualInterestRate(5.5);
        assertEquals(5.5, SavingsAccount.getAnnualInterestRate());
    }
    @Test
    void testThatSaverCanDepositIntoAccount(){
        SavingsAccount saver = new SavingsAccount();
        saver.deposit(10000);
        assertEquals(10000, saver.getBalance());
    }
    @Test
    void testThatMonthlyInterestCanBeCalculated(){
        SavingsAccount saver = new SavingsAccount();
        SavingsAccount.modifyAnnualInterestRate(5.5);
        saver.deposit(12000);
        assertEquals(17500, saver.calculateMonthlyInterest());

    }
    @Test
    void testThatMonthlyInterestCanBeModified(){
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        SavingsAccount.modifyAnnualInterestRate(5.5);
        saver1.deposit(3000);
        saver2.deposit(4500);
        assertEquals(4375, saver1.calculateMonthlyInterest());
        assertEquals(6562.5, saver2.calculateMonthlyInterest());

        SavingsAccount.modifyAnnualInterestRate(6.0);
        assertEquals(4500, saver1.calculateMonthlyInterest());
        assertEquals(6750, saver2.calculateMonthlyInterest());

    }

}
