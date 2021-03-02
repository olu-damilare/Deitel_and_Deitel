import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		System.out.println("Enter a 3-digit number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int thirdDigit = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		
		if(number == thirdDigit)
			System.out.println("is a palindrome");
		if(number != thirdDigit)
			System.out.println("is not a palindrome"); 

	}


}