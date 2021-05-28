package tddClasses;

import Exercise.MyAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest {
    private MyAccount account;
    @BeforeEach
            void startAllTestsWith(){
        account = new MyAccount(123456);
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
    void testThatUserCanSetPin(){
        account.setPin("1234");
        assertEquals("1234", account.getPin());
    }
//    @Test
//    void testThatUserCanMakeWithdrawalWithCorrectPin(){
//        account.deposit(5000);
//        account.setPin(1234);
//        account.withdraw(3000.00, 1234);
//        assertEquals(2000, account.getBalance());
//    }

//    @Test
//    void testThatUserCannotWithdrawNegativeAmount(){
//        account.deposit(10000);
//        account.setPin(1234);
//        account.withdraw(-3000.00, 1234);
//        assertEquals(10000, account.getBalance());
//    }
//    @Test
//    void testThatUserCanMakeMoreThanOneWithdrawal(){
//        account.deposit(5000);
//        account.setPin(1234);
//        account.withdraw(3000.00, 1234);
//        account.withdraw(1000.00, 1234);
//        assertEquals(1000, account.getBalance());
//    }
//    @Test
//    void testThatUserCannotMakeWithdrawalWithInsufficientBalance(){
//        account.deposit(1000);
//        account.setPin(1234);
//        account.withdraw(3000.00, 1234);
//        assertEquals(1000, account.getBalance());
//    }
//    @Test
//    void testThatAccountCanTransferFunds(){
//        account.deposit(50000);
//        account.setPin(1234);
//        account.transfer(3000, 1234);
//        assertEquals(47000, account.getBalance());
//    }
//
//    @Test
//    void testThatAccountCanRechargePhoneNumber(){
//        account.deposit(1000);
//        account.setPin(1234);
//        account.recharge(100, 1234);
//        assertEquals(900, account.getBalance());
//    }
}
