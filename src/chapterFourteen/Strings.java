package chapterFourteen;

import java.util.Random;


public class Strings{

    private String[][] words = new String[4][];
    public String splitPhoneNumber(String value){
        StringBuilder suffix = new StringBuilder();
        int counter = 1;
        for (int i = value.length() - 4; i >= 0; i--) {
            suffix.append(value.charAt(i));
            if(counter % 3 == 0)
                suffix.append("-");
            counter++;
        }
        StringBuilder prefix = new StringBuilder("(+");
        for (int i = value.length() - 3; i < value.length() ; i++) {
                prefix.append(value.charAt(i));
        }
        prefix.append(") ");
       prefix.append(suffix.toString());
        return prefix.toString();
    }

    public char[] splitStringToCharArray(String value){
        StringBuilder suffix = new StringBuilder();
        int counter = 1;
        for (int i = value.length() - 4; i >= 0; i--) {
            suffix.append(value.charAt(i));
            if(counter % 3 == 0)
                suffix.append("-");
            counter++;
        }
        StringBuilder newWord = new StringBuilder("(+");
        for (int i = value.length() - 3; i < value.length() ; i++) {
            newWord.append(value.charAt(i));
        }
        newWord.append(") ");
        newWord.append(suffix.toString());
        return newWord.toString().toCharArray();
    }

    public boolean isPalindrome(String string){
        string = string.toLowerCase();
        boolean isPalindrome = true;
        int backwardCounter = string.length() - 1;
        for (int i = 0; i < string.length() && backwardCounter != i; i++) {
           if(string.charAt(i) != string.charAt(backwardCounter)) {
               isPalindrome = false;
               break;
           }
           backwardCounter--;
        }
        return isPalindrome;
    }

    public boolean compareStringPortions(String firstString, String secondString, int firstStringStartIndex, int secondStringStartIndex, int numberOfCharacters){

        return firstString.toLowerCase().regionMatches(firstStringStartIndex, secondString.toLowerCase(), secondStringStartIndex, numberOfCharacters);
    }

    public String randomSentences(){
        words[0]  = new String[]{"the", "a", "one", "some", "any"};
        words[1] = new String[]{"boy", "girl", "dog", "town", "car"};
        words[2] = new String[]{"drove", "jumped", "ran", "walked", "skipped"};
        words[3] = new String[]{"to", "from", "over", "under", "on"};
        Random random = new Random();
        StringBuilder sentence = new StringBuilder();

        for (int i = 0; i <= 6; i++) {
            int arrayIndex = random.nextInt(5);
            if(i < 4) sentence.append(words[i][arrayIndex]).append(" ");
            else if(i == 5) sentence.append(words[i / 6][arrayIndex]).append(" ");
            else if(i == 6) sentence.append(words[i / 6][arrayIndex]).append(".");
        }
        return sentence.substring(0,1).toUpperCase() + sentence.substring(1);
    }

    public String tokenizePhoneNumber(String phoneNumber){
        String[] digits = phoneNumber.split("\\) ");
        StringBuilder tempPhoneNumber = new StringBuilder(digits[0]);
        tempPhoneNumber.append(digits[1]);
        digits = tempPhoneNumber.toString().split("-");
        tempPhoneNumber.delete(0, tempPhoneNumber.length());
        tempPhoneNumber.append(digits[0]).append(digits[1]);

        return tempPhoneNumber.substring(1);
    }

    public String reverseSentence(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString();
    }


    public static void main(String[] args) {
        Strings string = new Strings();
        System.out.println(string.reverseSentence("What is your name?")); ;

        //System.out.printf("%s", (int)'c');

    }



}
