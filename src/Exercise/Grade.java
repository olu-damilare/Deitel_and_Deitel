import java.util.Scanner;
public class Grade{

	public static void main(String[] args){

	System.out.println("Enter your score");
	Scanner input = new Scanner(System.in);
	double score = input.nextDouble();
	
	if (score > 100)
		System.out.println("invalid score");
	else if(score < 0)
		System.out.println("invalid score");
	else if(score >= 90)
		System.out.println("Grade A");
	else if(score >= 80)
		System.out.println("Grade B");
	else if(score >= 70)
		System.out.println("Grade C");
	else 
		System.out.println("fail");
		
	}

}  