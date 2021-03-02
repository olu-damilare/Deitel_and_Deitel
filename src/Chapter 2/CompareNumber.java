import java.util.Scanner;

public class CompareNumber {

	public static void main (String[] args){
		int myNumber = 50;

	Scanner number = new Scanner(System.in);
	System.out.println("Input your number: ");
	int yourNumber = number.nextInt();

	if(yourNumber < myNumber){
		System.out.print(yourNumber + " is less than my Number");
	}
	if(yourNumber > myNumber){
		System.out.println(yourNumber + " is greater than my Number");
	}
	if(yourNumber == myNumber){
		System.out.println(yourNumber + " is equal to my Number");
}
}



}