package Exercise;

import java.util.Random;

public class Kata {
    private double amount;

    public static int sumArray(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static double averageArray(int[] array) {
        return sumArray(array) / array.length;
    }

    public static int getMaximumArrayElement(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            maximum = Math.max(array[i], maximum);
        }
        return maximum;
    }

    public static int getMinimumArrayElement(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            minimum = Math.min(array[i], minimum);
        }
        return minimum;
    }

    public static int getMaximumSumInArray(int[] array) {
        int minimum = getMinimumArrayElement(array);
        int sum = sumArray(array);

        return sum - minimum;
    }

    public static int getMinimumSumInArray(int[] array) {
        int maximum = getMaximumArrayElement(array);
        int sum = sumArray(array);

        return sum - maximum;
    }

    public double calculateAverage(int firstValue, int secondValue, int thirdValue) {
        double average = ((double) (firstValue + secondValue + thirdValue)) / 3;
        return average;
    }

    public String calculateGrade(int score) {
        if (score > 100)
            return "Invalid Score";
        else if (score < 0)
            return "invalid score";
        else if (score >= 90)
            return "Grade A";
        else if (score >= 80)
            return "Grade B";
        else if (score >= 70)
            return "Grade C";
        else if (score >= 60)
            return "Grade D";
        else
            return "Fail";
    }

    public boolean isEven(int number) {
        if (number % 2 == 0)
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

        if (quantity <= 0)
            quantity = 0;

        if (quantity >= 200)
            amount = 800.00 * quantity;
        else if (quantity >= 100)
            amount = 900.00 * quantity;
        else if (quantity >= 50)
            amount = 1000.00 * quantity;
        else if (quantity >= 30)
            amount = 1100.00 * quantity;
        else if (quantity >= 10)
            amount = 1200.00 * quantity;
        else if (quantity >= 5)
            amount = 1400.00 * quantity;
        else if (quantity >= 1)
            amount = 1500.00 * quantity;


        return amount;
    }

    public double getAmount() {
        return amount;
    }

    public static String calculateFactors(int number) {
        String factors = "";
        if (number > 0) {
            for (int i = 1; i <= (number / 2); i++) {
                if (number % i == 0 && i < number)
                    factors += i + ",";
            }
            factors += number;
        } else factors = "invalid input";

        return factors;

    }

    public void shuffle(int[] array) {
        Random randomizer = new Random();
        int firstIndex;
        int secondIndex;
        int tempValueHolder;

        for (int i = 0; i < array.length; i++) {
            firstIndex = randomizer.nextInt(array.length);
            secondIndex = randomizer.nextInt(array.length);

            tempValueHolder = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = tempValueHolder;
        }
    }

    public void sort(int[] array, boolean ascendingOrder) {
        int selectedValue = array[0];

        if (ascendingOrder) {
            sortAscendingOrder(array, selectedValue);
        } else {
            sortDescendingOrder(array, selectedValue);
        }
    }

    private void sortDescendingOrder(int[] array, int selectedValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (selectedValue < array[j]) {
                    int temp = array[j];
                    array[j] = selectedValue;
                    selectedValue = temp;
                }
            }
            array[i] = selectedValue;
            if ((i + 1) != array.length)
                selectedValue = array[i + 1];
        }
    }

    private void sortAscendingOrder(int[] array, int selectedValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (selectedValue > array[j]) {
                    int temp = array[j];
                    array[j] = selectedValue;
                    selectedValue = temp;
                }
            }
            array[i] = selectedValue;
            if ((i + 1) != array.length)
                selectedValue = array[i + 1];
        }
    }
}
