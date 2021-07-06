package chapterEighteen;

public class Palindrome {

    public boolean isPalindrome(String word) {
        String newWord = reverseWord(word);
        return newWord.equals(word);

    }

    public String reverseWord(String word){
        if(word.length() == 1)
            return word;
        return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
    }

    public char[] reverseCharArray(char[] chars) {
        return reverseWord(String.valueOf(chars)).toCharArray();
    }
}
