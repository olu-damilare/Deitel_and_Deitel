package chapterEight;

public class SavingsAccount {
    private static double annualInterestRate;
    private double balance;

    public static void modifyAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void deposit(double amount) {
        if(amount > 0)
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateMonthlyInterest() {
        return (balance * annualInterestRate)/12 + balance;
    }
}
