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

    public char[] splitPhoneNumberToCharArray(String value){
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
        validatePhoneNumber(phoneNumber);
        String[] digits = phoneNumber.split("[)]\\s");
        StringBuilder tempPhoneNumber = new StringBuilder(digits[0]);
        tempPhoneNumber.append(digits[1]);
        digits = tempPhoneNumber.toString().split("-");
        tempPhoneNumber.delete(0, tempPhoneNumber.length());
        tempPhoneNumber.append(digits[0]).append(digits[1]);

        return tempPhoneNumber.substring(1);
    }

    private void validatePhoneNumber(String phoneNumber) {
        if(!phoneNumber.matches("[(]\\d{3}[)]\\s\\d+-\\d+"))
            throw new IllegalArgumentException("Invalid phone number format. e.g (123) 456-7890");
    }

    public String reverseSentence(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString();
    }

    public int numberOfCharOccurrence(String sentence, char character){
        sentence = sentence.toLowerCase();
        character = Character.toLowerCase(character);
        int numberOfOccurrence = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(character == sentence.charAt(i))
                numberOfOccurrence++;
        }
        return numberOfOccurrence;
    }

    public int numberOfStringOccurrence(String sentence, String subSentence){
        sentence = sentence.toLowerCase();
        subSentence = subSentence.toLowerCase();
        int numberOfOccurrence = 0;
        for (int i = 0; i < sentence.length(); i++) {
                if(sentence.startsWith(subSentence, i))
                 numberOfOccurrence++;
        }
        return numberOfOccurrence;
    }

    public String pigLatin(String sentence){
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");
        StringBuilder latinSentence = new StringBuilder();
        for (String word : words) {
            latinSentence.append(word.substring(1)).append(word.charAt(0)).append("ay").append(" ");
        }
        return latinSentence.toString();
    }

    public String tokenizeAndCompareStartingStrings(String string){
        String[] words = string.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.startsWith("b"))
                sb.append(word).append(" ");
        }
        return sb.toString();

    }

    public String tokenizeAndCompareEndingStrings(String string) {
        String[] words = string.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.endsWith("ed"))
                sb.append(word).append(" ");
        }
        return sb.toString();
    }

    public int indexOf(String string, char character){
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if(character == string.charAt(i)) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int lastIndexOf(String string, char character){
        int index = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            if(character == string.charAt(i)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
