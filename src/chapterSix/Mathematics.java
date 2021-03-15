package chapterSix;

public class Mathematics {

    public static boolean isMultiple(int firstNumber, int secondNumber) {
        return secondNumber % firstNumber == 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String displayAsterisks(int size) {
        String asterisks = "";
        int counter = 0;
        while(counter < size){
            for (int i = 0; i < size; i++) {
                asterisks += "*";
            }
            counter++;
            if(counter == size)
                break;
            asterisks += "\n";
        }
        return asterisks;
    }

    public static String displaySquareOfCharacter(char character, int size) {
        String square = "";
        int counter = 0;
        while(counter < size){
            for (int i = 0; i < size; i++) {
                square += character;
            }
            counter++;
            if(counter == size)
                break;
            square += "\n";
        }
        return square;
    }

    public static double calculateAreaOfCircle(double radius) {
      return  Math.PI * radius * radius;
    }

    public static boolean isPerfect(int number) {
        int total = 0;
        for (int i = 1; i <= (number/2); i++) {
            if(number % i == 0)
                total += i;
        }
        return total == number;

    }

    public static String displayFactorsOfPerfectNumber(int number) {
        if(isPerfect(number)){
        String factors = "";
        int i = 1;
        for (; i < (number/2); i++) {
            if(number % i == 0)
                factors += i + " ";
        }
        factors += i;
        return factors;
    }
        else return "Not a perfect number";
    }

    public static boolean isPrime(int number) {
        int counter = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0)
                counter++;
        }
        return counter == 0;

    }

    public static String reverseNumber(int number) {
        String reversedNumber = "";
        if(number < 0)
            reverseNegativeNumber(number);

        else {

            while (number > 0) {
                reversedNumber += number % 10;
                number /= 10;
            }
        }
            return reversedNumber;

    }

    public static String reverseNegativeNumber(int negativeNumber) {
            String reversedNumber = "-";
            negativeNumber -= (negativeNumber * 2);

            while (negativeNumber > 0) {
                reversedNumber += negativeNumber % 10;
                negativeNumber /= 10;
            }
            return reversedNumber;
        }

}
