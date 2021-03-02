import java.util.Scanner;
public class BodyMassIndex{

	public static void main(String[] args){
	
	System.out.println("What is your weight(kg)?");
	Scanner userInput = new Scanner(System.in);
	float weight = userInput.nextFloat();	

	System.out.println("What is your height (in metres)?");
	float height = userInput.nextFloat();

	float BMI = weight/(height * height);

	System.out.printf("Your body mass index is %.2f%n%n", BMI);

	System.out.println("BMI VALUES");
	System.out.println("Underweight: less than 18.5");
	System.out.println("Normal:	between 18.5 and 24.9");
	System.out.println("Overweight:	between 25 and 29.9");
	System.out.println("Obese:	30 or greater");

		

	}

}