import java.util.Scanner;
public class HeartRatesTest{
	public static void main(String[] args){
	HeartRates patient = new HeartRates("John", "Doe", 12/05/1967);
	
	System.out.println("Enter your first name");
	Scanner input = new Scanner(System.in);
	String firstName = input.nextLine();
	patient.setFirstName(firstName);

	System.out.println("Enter your last name");
	String lastName = input.nextLine();
	patient.setLastName(lastName);	

	System.out.println("Enter your month of birth");
	int monthOfBirth = input.nextInt();
	System.out.println("Enter your day of birth");
	int dayOfBirth = input.nextInt();
	System.out.println("Enter your year of birth");
	int yearOfBirth = input.nextInt();
	patient.setDOB(monthOfBirth, dayOfBirth, yearOfBirth);
	
	System.out.println("the full name is " + patient.getFirstName() + " " + patient.getLastName());
	System.out.println("the date of birth is " + ((String)patient.getDateOfBirth()));	
	System.out.println("the age is " + patient.calculateAge());
	System.out.println("the maximum heart rate is " + patient.calculateMHR());
	System.out.println("the target heart rate is " + patient.getTargetHeartRate() + " beats per minute");
	}

}