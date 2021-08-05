package chapterTwentyOne;

import java.util.*;

public class ListOperations<T>{

    public static void concatenate(LinkedList<Character> firstList, LinkedList<Character> secondList){
            firstList.addAll(secondList);
    }


    public List<T> reverseCopy(List<T> list ){
        List<T> newList = new ArrayList<T>();

        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    public String reverseString(String sentence){
        String[] words = sentence.split("\\s+");
        Stack<String> stack = new Stack<String>();
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder newString = new StringBuilder();
        while(!stack.isEmpty()){
            newString.append(stack.pop()).append(" ");
        }
        return newString.toString();
    }


    public boolean isPalindrome(String string){
        Stack<Character> chars = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            chars.push(string.charAt(i));
        }
       while(!chars.isEmpty()){
           sb.append(chars.pop());
       }
       return sb.toString().equals(string);
    }


}
