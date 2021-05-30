package Exercise;

public class MyAccount {


    private double balance;
    private String pin;
    private int accountNumber;

    public MyAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){ return accountNumber; }
    public void deposit(double depositAmount) { if(depositAmount > 0) balance += depositAmount; }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount, String pin) {
        if(pin.equals(this.pin) && withdrawAmount > 0 && balance > withdrawAmount)
            balance -= withdrawAmount;
    }

    public void setPin(String pin) { if(pin.length() == 4) this.pin = pin; }

    public String getPin() { return pin; }

    public void transfer(double transferAmount, String pin) {
        withdraw(transferAmount, pin);
    }

    public void recharge(int rechargeAmount, String pin) {
        withdraw(rechargeAmount, pin);
    }
}
