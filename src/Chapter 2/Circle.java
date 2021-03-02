import java.util.Scanner;
public class Circle{

	public static void main(String... arg){

	double pi = 3.14159;
	
	System.out.print("Enter the radius of your desired circle in: ");
	Scanner userInput = new Scanner(System.in);
	float radius = userInput.nextFloat();

	float diameter = 2 * radius;
	double circumference = 2 * pi * radius;
	double area = pi * radius * radius;

	System.out.printf("\nfor radius " + radius + ", the diameter is %.2f%n", diameter);
	System.out.printf("for radius " + radius + ", the circumference is approximately %.2f%n", circumference);
	System.out.printf("for radius " + radius + ", the area is approximately %.2f%n", area);

}
 


}