package tddClasses;

public class MyAccount {


    private double balance;
    private int pin;

    public void deposit(double depositAmount) {
        if(depositAmount > 0)
        balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount, int pin) {
        if(pin == this.pin && balance > withdrawAmount && withdrawAmount > 0 )
            balance -= withdrawAmount;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}
