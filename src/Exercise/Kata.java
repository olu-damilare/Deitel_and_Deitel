package Exercise;

public class Kata {
    private double amount;

    public double calculateAverage(int firstValue, int secondValue, int thirdValue){
        double average = ((double)(firstValue + secondValue + thirdValue))/3;
        return average;
    }
    public String calculateGrade(int score){
        if(score > 100)
            return "Invalid Score";
        else if (score < 0)
                return "invalid score";
        else if (score >= 90)
            return "Grade A";
            else if (score >= 80)
                return "Grade B";
            else if (score >= 70)
                return "Grade C";
                else if(score >= 60)
                    return "Grade D";
                    else
                        return "Fail";
    }
    public boolean isEven(int number){
        if(number % 2 == 0)
            return true;
            else
                return false;
    }
    public boolean isPrimeNumber(int number) {
        int initialValue = 2;
        int counter = 0;

        while (initialValue <= number) {
            if (number % initialValue == 0)
                counter++;
            initialValue++;
        }

        if (counter == 1)
                return true;
        else
            return false;
    }

    public double testDriller(int quantity) {

        if(quantity <= 0)
            quantity = 0;

        if(quantity >= 200)
            amount = 800.00 * quantity;
        else
        if(quantity >= 100)
            amount = 900.00 * quantity;
        else
        if(quantity >= 50)
            amount = 1000.00 * quantity;
        else
        if(quantity >= 30)
            amount = 1100.00 * quantity;
        else
        if(quantity >= 10)
            amount = 1200.00 * quantity;
        else
        if(quantity >= 5)
            amount = 1400.00 * quantity;
        else
        if(quantity >= 1)
            amount = 1500.00 * quantity;


    return amount;
    }

    public double getAmount() {
        return amount;
    }
}
