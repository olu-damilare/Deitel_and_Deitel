package chapterFour;
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
       double total = 0;
        System.out.println("Input the value of item sold or -1 to exit");
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        if(value != -1);
            total += value;

        while(value != -1){
            System.out.println("Input the value of item sold or -1 to exit");
            if(value != -1) {
                value = input.nextDouble();
                total += value;
            }
        }
        double commission = 0.09 * total;
        double earning = 200 + commission;

        System.out.printf("Your earning is $%.2f%n", earning);
    }
}
