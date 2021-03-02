import java.util.Scanner;
public class SeparatingDigits{
	public static void main(String[] args){
		System.out.println("Enter a five-digit number");
		Scanner input = new Scanner(System.in);
		int figure = input.nextInt();

		if(figure >= 9999 && figure <= 100000){
			int fifth = figure % 10;
			figure /=10;
			int fourth = figure % 10;
			figure /=10;
			int third = figure % 10;
			figure /=10;
			int second = figure % 10;
			figure /=10;
			System.out.println(figure + " " + second + " " + third + " " + fourth + " " + fifth);
		}
		else
			System.out.println("invalid number");
		
	}
}