import java.util.Scanner;
public class LargestAndSmallest{
	public static void main (String[] args){
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int firstNumber = number.nextInt();
		
		System.out.println("Enter the second number");
		int secondNumber = number.nextInt();

		System.out.println("Enter the third number");
		int thirdNumber = number.nextInt();

		System.out.println("Enter the fourth number");
		int fourthNumber = number.nextInt();

		System.out.println("Enter the fifth number");
		int fifthNumber = number.nextInt();

		int largestNumber;
		int smallestNumber;
		if(firstNumber > secondNumber){
			largestNumber = firstNumber;
			smallestNumber = secondNumber;
		}
		else {
			largestNumber = secondNumber;
			smallestNumber = firstNumber;
		}
		if(thirdNumber > largestNumber)
			largestNumber = thirdNumber;
		if(thirdNumber < smallestNumber)
			smallestNumber = thirdNumber;
		if(fourthNumber > largestNumber)
			largestNumber = fourthNumber;
		if(fourthNumber < smallestNumber)
			smallestNumber = fourthNumber;
		if(fifthNumber > largestNumber)
			largestNumber = fifthNumber;
		if(fifthNumber < smallestNumber)
			smallestNumber = fifthNumber;
	
		System.out.println("the largest number is " + largestNumber);
		System.out.println("the smallest number is " + smallestNumber);

	}

}