import java.util.Scanner;
public class Multiples {
	public static void main(String[] args){
	
	Scanner mult = new Scanner(System.in);
	System.out.println("Enter your first number: ");
	int a = mult.nextInt();

	System.out.println("Enter another number: ");
	int b = mult.nextInt();	

	if(a % b == 0){
	int c = a / b; 
	System.out.println("\n" + c);
	}
	else{
	System.out.println(a + " is not a multiple of " + b);
	}
	if(b % a == 0){
	int d = b / a;
	System.out.println("\n" + d);
	}
	else{
	System.out.println(b + " is not a multiple of " + a);
	}
	
	
}



}