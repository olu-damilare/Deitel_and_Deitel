package Exercise;

import java.util.Scanner;

public class StudentGradeAverageWithDifferentLoops {
    public static void main(String[] args) {
        double total = 0.0;
        int gradeCounter = 0;
        double grade;

        Scanner input = new Scanner(System.in);

        while (gradeCounter < 10) {
            System.out.println("Enter the score of the student ");
            grade = input.nextDouble();
            if (grade >= 1 && grade <= 100) {
                total += grade;
                gradeCounter++;
            }
        }
        double average = total / (gradeCounter * 1.0);
        System.out.println("average is " + average);


        average = 0.0;
        grade = 0;

        for (gradeCounter = 0; gradeCounter < 10;) {
            System.out.println("Enter the score of the student ");
            grade = input.nextDouble();
            if (grade >= 1 && grade <= 100) {
                total += grade;
                gradeCounter++;
            }
        }
        average = total / (gradeCounter * 1.0);
        System.out.println("average is " + average);


        average = 0.0;
        grade = 0;

        do{
            System.out.println("Enter the score of the student ");
            grade = input.nextDouble();
            if (grade >= 1 && grade <= 100) {
                total += grade;
                gradeCounter++;
            }
        }
        while (gradeCounter < 10);

        average = total / (gradeCounter * 1.0);
        System.out.println("average is " + average);
    }
}
