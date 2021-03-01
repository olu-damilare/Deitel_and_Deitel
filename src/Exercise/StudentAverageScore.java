package Exercise;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {
        double total = 0;
        int gradeCounter = 0;
        double grade;

        Scanner input = new Scanner(System.in);

        while (gradeCounter < 10) {
            System.out.println("Enter the score of the student ");
            grade = input.nextDouble();
            if (grade >= 1 && grade <= 100)
                total += grade;
            gradeCounter++;
        }

        double average = total / (gradeCounter * 1.0);
        System.out.println("average is " + average);
    }
}