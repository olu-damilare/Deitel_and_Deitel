import java.util.Scanner;
public class DateTest{

	public static void main(String[] args){

	Date calendar = new Date(1, 1, 1900);

	System.out.println("input the year in digit");
	Scanner input = new Scanner(System.in);
	int myYear = input.nextInt();
	calendar.setYear(myYear);
	
	System.out.println("input the month in digit");
	int myMonth = input.nextInt();
	calendar.setMonth(myMonth);

	System.out.println("input the day in digit");
	int myDay = input.nextInt();
	calendar.setDay(myDay);	

	System.out.println("the date is " + calendar.displayDate());

		

	}
		
}