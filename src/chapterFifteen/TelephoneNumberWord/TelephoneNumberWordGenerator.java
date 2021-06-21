package chapterFifteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TelephoneNumberWordGenerator {
    String[][] letters = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"},
                            {"P", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y"},};

    private File file;
    private PrintWriter writer;
    private Scanner reader;

    public TelephoneNumberWordGenerator(){
        file = new File("Telephone_words.txt");

    }

    public void generateWords(String phoneNumber) throws FileNotFoundException {
        validatePhoneNumber(phoneNumber);
        String[] splitNumber = phoneNumber.split("-");
        phoneNumber = splitNumber[0] + splitNumber[1];
        String newWord;
        writer = new PrintWriter(file);

        int firstVal = Integer.parseInt(String.valueOf(phoneNumber.charAt(0))) - 2;
        int secondVal = Integer.parseInt(String.valueOf(phoneNumber.charAt(1))) - 2;
        int thirdVal = Integer.parseInt(String.valueOf(phoneNumber.charAt(2))) - 2;
        int fourthVal = Integer.parseInt(String.valueOf(phoneNumber.charAt(3))) - 2;
        int fifthVal = Integer.parseInt(String.valueOf(phoneNumber.charAt(4))) - 2;
        int sixthVal = Integer.parseInt(String.valueOf(phoneNumber.charAt(5))) - 2;
        int seventhVal = Integer.parseInt(String.valueOf(phoneNumber.charAt(6))) - 2;

            for (int j = 0; j < letters[firstVal].length; j++) {
                for (int k = 0; k < letters[secondVal].length; k++) {
                    for (int l = 0; l < letters[thirdVal].length; l++) {
                        for (int m = 0; m < letters[fourthVal].length; m++) {
                            for (int n = 0; n < letters[fifthVal].length; n++) {
                                for (int o = 0; o < letters[sixthVal].length; o++) {
                                    for (int p = 0; p < letters[seventhVal].length; p++) {
                                        newWord = letters[firstVal][j] + letters[secondVal][k] + letters[thirdVal][l] + letters[fourthVal][m] +
                                                letters[fifthVal][n] + letters[sixthVal][o] + letters[seventhVal][p];
                                        writer.print(newWord + " ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

        }

    public boolean contains(String word) throws FileNotFoundException {
        reader = new Scanner(file);
        String readWord;
        boolean isFound = false;
        while(reader.hasNext()){
            readWord = reader.next();
            if(readWord.equalsIgnoreCase(word)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public void validatePhoneNumber(String phoneNumber){
        for (int i = 0; i < phoneNumber.length(); i++) {
            if(!Character.isDigit(phoneNumber.charAt(i)))
                throw new InputMismatchException("Phone number contains non-digit value");
            else if(phoneNumber.charAt(i) == '1' || phoneNumber.charAt(i) == '0')
                throw new InputMismatchException("Phone number should not contain '1' or 'zero' ");
        }
    }
}

