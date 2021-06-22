package chapterFifteen.studentPoll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPollFrequency {

    private Scanner reader;
    private Formatter formatter;
    private int[] polls = new int[6];
    private File file;

    public StudentPollFrequency() throws FileNotFoundException {
        file = new File("src\\chapterFifteen\\studentPoll\\numbers.txt");
        reader = new Scanner(file);
        formatter = new Formatter("src\\chapterFifteen\\studentPoll\\output.txt");

    }

    public void generateFrequency(){
        while(reader.hasNextInt()){
            ++polls[reader.nextInt()];
        }
        formatter.format("%s%12s", "Rating", "Frequency\n");
        for (int i = 1; i < polls.length; i++) {
            formatter.format("%5d%5d%s", i, polls[i], "\n");
        }
    }

    public void closeFiles(){
        formatter.close();
    }

    public static void main(String[] args) {
        try {
            StudentPollFrequency frequency = new StudentPollFrequency();
            frequency.generateFrequency();
            frequency.closeFiles();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


}
