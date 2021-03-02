package tddClasses;

public class MyAccount {


    private double balance;

    public void deposit(double depositAmount) {
        if(depositAmount > 0)
        balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount) {
        if(balance > withdrawAmount && withdrawAmount > 0)
            balance -= withdrawAmount;
    }
}
