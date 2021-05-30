package Exercise;

import java.security.SecureRandom;

public class RandomPrimeNumberWithinAGivenRange {
    SecureRandom random = new SecureRandom();

    public boolean isPrimeNumber(int number) {

        int initialValue = 2;
        int counter = 0;

        while (initialValue <= number) {
            if (number % initialValue == 0)
                counter++;
            initialValue++;
        }
        return counter == 1;
    }

    public int randomPrimeNumber(int startValue, int rangeValue) {

        int primeNumber = 0;
        if(rangeValue <= 0 || startValue > rangeValue)
           return primeNumber;

        else if(rangeValue == 1)
            primeNumber = 1;
        else {
            for (int i = 1; i <= rangeValue; i++) {
                int randomNumber = startValue + random.nextInt((rangeValue - startValue) + 1);
                if (isPrimeNumber(randomNumber)) {
                    primeNumber = randomNumber;
                    break;
                }
            }
        }
        return primeNumber;
    }
}
