package Exercise;

public class KataTest {
    public static void main(String[] args) {
        Kata newKata = new Kata();

     System.out.printf("The average is %.2f%n",newKata.calculateAverage(30, 45,23));
        System.out.println(newKata.calculateGrade(200));
        System.out.println(newKata.isEven(42));
        System.out.println(newKata.isPrimeNumber(6));
    }
}
