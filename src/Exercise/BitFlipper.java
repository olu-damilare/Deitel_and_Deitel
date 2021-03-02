import java.util.Scanner;
public class BitFlipper{
	public static void main(String[] args){
		System.out.println("Enter a binary digit. E.g. 1 or 0:");
		Scanner input = new Scanner(System.in);
		int binaryDigit = input.nextInt();

		if(binaryDigit == 0)
		System.out.println("your input is flipped to 1");
		else if(binaryDigit == 1)
		System.out.println("your input is flipped to 0");
		else
		System.out.println("you entered an invalid digit");

	}

}