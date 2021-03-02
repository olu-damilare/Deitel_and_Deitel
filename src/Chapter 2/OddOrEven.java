import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args){
	Scanner num = new Scanner(System.in);

	System.out.println("Input number: ");
	int x = num.nextInt();

	if(x % 2 == 0){
	System.out.println(x + " is an even number");
	}
	else{
	System.out.println(x + " is an odd number");
}


}




}