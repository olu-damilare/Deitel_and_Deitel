import java.util.Scanner;

public class SumIntegar{
    public static void main(String[] args){
	int x, y, newSum;

	Scanner fig = new Scanner(System.in);
	System.out.println("What is your first number? ");
	x = fig.nextInt();

	System.out.println("And your second number is...? ");
	y = fig.nextInt();

	newSum = x + y;
	System.out.println("The sum of both numbers is: " + newSum);
	




   }

} 