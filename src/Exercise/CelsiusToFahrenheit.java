import java.util.Scanner;
public class CelsiusToFahrenheit{

	public static void main(String[] args){

	System.out.println("Input your temperature in celsius");
	Scanner temp = new Scanner(System.in);
	double celsiusTemp = temp.nextDouble();

	double fahrenheit = (9.0/5.0) * celsiusTemp + 32;
	System.out.println(celsiusTemp + " degrees is equal to " + fahrenheit + " fahrenheit");
	}

}