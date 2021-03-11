package chapterFive;

public class FairTax {

    private double totalExpense = 0;

    public void setExpense(double expense) {
        if(expense > 0)
        totalExpense += expense;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public double CalculateTax() {
        double rate = 0.30;

        return rate * totalExpense;
    }
}
