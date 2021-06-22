package chapterFifteen.studentPoll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPoll {

    private Formatter formatter;

    public StudentPoll() throws FileNotFoundException {
        File file = new File("src\\chapterFifteen\\studentPoll\\numbers.txt");
        formatter = new Formatter(file);
    }

    public void writeToFile(int pollValue){
        if(pollValue > 0 && pollValue < 6) {
            formatter.format("%d%s", pollValue, " ");
        }
    }

    public void closeFile(){
        formatter.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            StudentPoll studentPoll = new StudentPoll();
            while(scanner.hasNextInt()){
                System.out.println("Enter a poll value:");
                studentPoll.writeToFile(scanner.nextInt());
            }
            studentPoll.closeFile();
        }catch(FileNotFoundException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }



    }


}
