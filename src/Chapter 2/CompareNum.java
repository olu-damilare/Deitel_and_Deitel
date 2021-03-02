import java.util.Scanner;

public class CompareNum {
	public static void main(String[] args){
	
	double a, b;

	Scanner input = new Scanner(System.in);
	System.out.println("Input your first digit");
	a = input.nextDouble();

	System.out.println("Input your second digit");
	b = input.nextDouble();

	if(a > b){
	System.out.println(a + " is greater than " + b);
	}

	else if(a < b) {
	System.out.println(a + " is less than " + b);
	}

	else{
	System.out.println("both numbers are equal");
}


}

}