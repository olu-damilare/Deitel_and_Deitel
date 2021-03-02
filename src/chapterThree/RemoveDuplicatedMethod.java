public class RemoveDuplicatedMethod{

	private String name;
	private double balance;

	public RemoveDuplicatedMethod(String name, double balance){
		this.name = name;
		if(balance > 0.0)
			this.balance = balance;
	
	}
	public void deposit(double depositAmount){
	if (depositAmount > 0)
		balance += depositAmount;
	}
	public void withdraw(double withdrawAmount){
		
		if(withdrawAmount > balance)
			System.out.println("Withdrawal amount exceeded account balance");

		if(withdrawAmount > 0 && withdrawAmount < balance)
			balance -= withdrawAmount;
	}
	public static void displayAccount(String accountName, double accountBalance){
		System.out.printf("%s balance: $%.2f%n", accountName, accountBalance);
	}
	public double getBalance(){
		return balance;
	}
	public void setName(String name){
	this.name = name;
	}
	public String getName(){
		return name;
	}
	
}