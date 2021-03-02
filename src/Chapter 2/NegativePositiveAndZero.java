import java.util.Scanner;
public class NegativePositiveAndZero{
	public static void main(String[] args){

	System.out.println("Enter five numbers");
	Scanner input = new Scanner(System.in);
	int firstNumber = input.nextInt();
	int secondNumber = input.nextInt();
	int thirdNumber = input.nextInt();
	int fourthNumber = input.nextInt();
	int fifthNumber = input.nextInt();

	int positive = 0;
	int negative = 0;
	int zero = 0;

	if(firstNumber > 0)
		positive++;
	if(secondNumber > 0)
		positive++;
	if(thirdNumber > 0)
		positive++;
	if(fourthNumber > 0)
		positive++;
	if(fifthNumber > 0)
		positive++;
	if(firstNumber < 0)
		negative++;
	if(secondNumber < 0)
		negative++;
	if(thirdNumber < 0)
		negative++;
	if(fourthNumber < 0)
		negative++;
	if(fifthNumber < 0)
		negative++;
	if(firstNumber == 0)
		zero++;
	if(secondNumber == 0)
		zero++;
	if(thirdNumber == 0)
		zero++;
	if(fourthNumber == 0)
		zero++;
	if(fifthNumber == 0)
		zero++;

	System.out.println("positive numbers are " + positive + " in number");
	System.out.println("negative numbers are " + negative + " in number");
	System.out.println("numbers equal to zero are " + zero + " in number");
	}


}