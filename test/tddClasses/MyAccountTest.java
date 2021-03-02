package tddClasses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest {
    private MyAccount account;
    @BeforeEach
            void startAllTestsWith(){
        account = new MyAccount();
    }

    @Test
    void testThatAccountCanReceiveDeposit(){
        account.deposit(5000.00);
        assertEquals(5000.00, account.getBalance());
    }
    @Test
    void testThatAccountCanReceiveDepositMoreThanOnce(){
        account.deposit(3000.00);
        account.deposit(2500.00);
        account.deposit(5000.00);
        assertEquals(10500.00, account.getBalance());
    }
    @Test
    void testThatAccountCannotDepositNegativeAmount(){
        account.deposit(3000.00);
        account.deposit(-1000);
        assertEquals(3000, account.getBalance());
    }
    @Test
    void testThatAccountCannotWithdrawNegativeAmount(){
        account.deposit(10000);
        account.withdraw(-3000.00);
        assertEquals(10000, account.getBalance());
    }

    @Test
    void testThatAccountCanMakeWithdrawal(){
        account.deposit(5000);
        account.withdraw(3000.00);
        assertEquals(2000, account.getBalance());
    }

    @Test
    void testThatAccountCanMakeMoreThanOneWithdrawal(){
        account.deposit(5000);
        account.withdraw(3000.00);
        account.withdraw(1000.00);
        assertEquals(1000, account.getBalance());
    }
    @Test
    void testThatAccountCannotMakeWithdrawalWithInsufficientBalance(){
        account.deposit(1000);
        account.withdraw(3000.00);
        assertEquals(1000, account.getBalance());
    }
}
