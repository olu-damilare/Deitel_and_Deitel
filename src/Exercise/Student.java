import java.util.Scanner;
public class Student{
	public static void main(String[] args){
		double total = 0;
		int gradeCounter = 1;

		while(gradeCounter <= 10){
			Scanner input = new Scanner(System.in);
			double grade = input.nextDouble();
			if(grade >= 1 && grade <= 100)
				total += grade;
			gradeCounter++;
		}

	double average = total / 10;
	System.out.println("average is " + average);
	System.out.println("total is " + total);
	}

}