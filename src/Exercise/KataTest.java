package Exercise;

import java.security.SecureRandom;


public class KataTest {
    public static void main(String[] args) {
        Kata newKata = new Kata();

        System.out.printf("The average is %.2f%n",newKata.calculateAverage(30, 45,23));
        System.out.println(newKata.calculateGrade(200));
        System.out.println(newKata.isEven(42));
        System.out.println(newKata.isPrimeNumber(5));

        SecureRandom randomNumbers = new SecureRandom();
        int primeNumber = 0;
        for (int i = 1; i <= 300; i++) {
            int numbers = 5 + randomNumbers.nextInt(296);
            boolean isPrimeNumber = newKata.isPrimeNumber(numbers);

            if (isPrimeNumber) {
                primeNumber = numbers;
                break;
            }
        }
        System.out.println(primeNumber);

        for (int i = 1; i <= 20 ; i++) {
            int die = (randomNumbers.nextInt(6));

            System.out.printf("%d%s", die, " ");

            if(i % 5 ==0)
                System.out.println();
        }


        }


}
