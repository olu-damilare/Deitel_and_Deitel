import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args){

	double smallest;
	double largest;

	Scanner arith = new Scanner(System.in);

	System.out.println("Input your first number");
	double x = arith.nextDouble();

	System.out.println("Input your second number");
	double y = arith.nextDouble();

	System.out.println("Input your third number");
	double z = arith.nextDouble();

	double sum = x + y + z;
	int average =  (int) (x + y + z)/3;
	double product = x*y*z;
	if(x < y){
	smallest = x;
	}
	else{
	smallest = y;
	}
	if(smallest > z){
	smallest = z;
	}

	if(x > y){
	largest = x;
	}
	else{
	largest = y;
	}
	if(largest < z){
	largest = z;
	}
	
	System.out.println("The sum of the numbers is " + sum);
	System.out.println("The product of the numbers is " + product);
	System.out.println("The average value is " + average);
	System.out.println("The minimum number is " + smallest);
	System.out.println("The maximum number is " + largest);
}	









}