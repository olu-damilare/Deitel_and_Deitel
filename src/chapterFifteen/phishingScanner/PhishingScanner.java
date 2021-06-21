package chapterFifteen.phishingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class PhishingScanner {

    private int[] pointValues = new int[30];
    private int[] totalPointValues = new int[30];
    private String[] phishingWords = {"how", "print", "order", "Learning", "Chapters", "ignore", "mission", "informed", "referral", "join", "opportunity",
                                      "online", "limited", "offers", "subscribe", "Discount", "sale", "Earn", "claim", "reward", "business", "grow",
                                        "close", "visit", "fee", "percent", "subscribers", "fetch", "result", "offer", "beneficiaries"};

    private PhishingScanner(){
        Random randomizer = new Random();
        for (int i = 0; i < pointValues.length; i++) {
            pointValues[i] = 1 + randomizer.nextInt(3);
        }
    }

    public void readForPhishingWords(File file) throws FileNotFoundException {
        if(file.exists()){
            String word;
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                word = reader.next();
                for (int i = 0; i < phishingWords.length; i++) {
                    if(word.equalsIgnoreCase(phishingWords[i])){
                        totalPointValues[i] += pointValues[i];
                    }
                }
            }
        }

    }

    public String displayOutput(){
        String output = "";
        for (int i = 0; i < totalPointValues.length; i++) {
            if(totalPointValues[i] != 0){
                output += phishingWords[i] + " " + totalPointValues[i] + "\n";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        File file = new File("src\\chapterFifteen\\phishingScanner\\mail.txt");
        PhishingScanner reader = new PhishingScanner();

        try {
            reader.readForPhishingWords(file);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println(reader.displayOutput());
    }


}
