package chapterSeven;

import java.util.Arrays;

public class EnhancedGradeBook {


    private String courseName;
    private final int[][] grades = new int[2][];

    public EnhancedGradeBook(String courseName, int numberOfStudents, int numberOfExams) {
        this.courseName = courseName;
        grades[0] = new int[numberOfExams];
        grades[1] = new int[numberOfStudents];
    }

    public void resetGrades(){
        for (int[] grade : grades) {
            Arrays.fill(grade, -1);
        }
    }

}
