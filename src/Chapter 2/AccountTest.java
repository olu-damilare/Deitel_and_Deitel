import java.util.Scanner;
public class AccountTest{

	public static void main(String[] args){

	Account myAccount = new Account("Damilare Jolayemi", 1000000.00);
	
	System.out.println("How much would you like to deposit?");
	Scanner input = new Scanner(System.in);
	double newDeposit = input.nextDouble();
	
	System.out.println("your initial balance is " + myAccount.getBalance());
	myAccount.deposit(newDeposit);
	System.out.printf("Your account balance is %.2f%n", myAccount.getBalance());
	
	myAccount.setName("Oludamilare Jolayemi");
	System.out.printf("Your account name is %s%n", myAccount.getName());


	}

} 