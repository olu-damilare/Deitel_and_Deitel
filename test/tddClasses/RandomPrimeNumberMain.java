package tddClasses;

public class RandomPrimeNumberMain {
    public static void main(String[] args) {
        RandomPrimeNumberWithinAGivenRange random = new RandomPrimeNumberWithinAGivenRange();

        System.out.println(random.randomPrimeNumber(1000, 20000));
    }
}
