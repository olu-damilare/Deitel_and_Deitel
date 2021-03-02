import java.util.Scanner;
public class RemoveDuplicatedMethodTest{
	public static void main(String[] args){
	ModifiedAccountClass account1 = new ModifiedAccountClass("Jane Green", 50.00);
	ModifiedAccountClass account2 = new ModifiedAccountClass("John Blue", -7.53);
	
	RemoveDuplicatedMethod.displayAccount(account1.getName(), account1.getBalance());
	RemoveDuplicatedMethod.displayAccount(account2.getName(), account2.getBalance());
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter deposit amount for account1: ");
	double depositAmount = input.nextDouble();
	System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
	account1.deposit(depositAmount);

	RemoveDuplicatedMethod.displayAccount(account1.getName(), account1.getBalance());
	RemoveDuplicatedMethod.displayAccount(account2.getName(), account2.getBalance());

	System.out.print("Enter deposit amount for account2: ");
	depositAmount = input.nextDouble();
	System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
	account2.deposit(depositAmount);

	System.out.print("Enter amount to withdraw for account1: ");
	double withdrawAmount = input.nextDouble();
	account1.withdraw(withdrawAmount);

	System.out.print("Enter amount to withdraw for account2: ");
	withdrawAmount = input.nextDouble();
	account2.withdraw(withdrawAmount);

	RemoveDuplicatedMethod.displayAccount(account1.getName(), account1.getBalance());
	RemoveDuplicatedMethod.displayAccount(account2.getName(), account2.getBalance());

	
	
}



}