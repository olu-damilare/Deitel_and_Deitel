package chapterFifteen.studentRecord;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRecord {

    private List<Student> students;
    private File studentFile;

    public StudentRecord(){
        students = new ArrayList<>();
        studentFile = new File("src\\chapterFifteen\\studentRecord\\Student_record.txt");
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void write() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(studentFile);

        int date =  LocalDateTime.now().getYear();
        writer.print("FN\tLN\tDOB\tAge\n");
        for (int i = 0; i < students.size(); i++) {
            writer.print(students.get(i).getFirstName() + " " + students.get(i).getLastName() + " " + students.get(i).getYearOfBirth() + " " + (date - students.get(i).getYearOfBirth()) + "\n");
        }

        writer.close();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student;
        StudentRecord record = new StudentRecord();

        System.out.println("Enter the first name of a student to record or ENTER + CTRL + D to exit");

        while(scanner.hasNext()) {
            String firstName = scanner.next();

            System.out.println("Enter the last name");
            String lastName = scanner.next();

            System.out.println("Enter the year of birth");
            int year = scanner.nextInt();

            student = new Student(firstName, lastName, year);
            record.addStudent(student);


            System.out.println("Enter the first name of a student to record or ENTER + CTRL + D to exit");


        }

        try {
            record.write();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }


}
