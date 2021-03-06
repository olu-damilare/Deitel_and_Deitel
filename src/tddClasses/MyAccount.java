package tddClasses;

public class MyAccount {


    private double balance;
    private int pin;
    private int accountNumber;

    public MyAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double depositAmount) {
        if(depositAmount > 0)
        balance += depositAmount;
    }


    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount, int pin) {
        if(pin == this.pin && withdrawAmount > 0 && balance > withdrawAmount)
            balance -= withdrawAmount;
    }

    public void setPin(int pin) {
        if(pin >= 0000 && pin <= 9999)
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void transfer(double transferAmount, int pin) {
        withdraw(transferAmount, pin);
    }

    public void recharge(int rechargeAmount, int pin) {
        withdraw(rechargeAmount, pin);
    }
}
