package chapterSeventeen;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWordRemoval {

    private List<Character> chars = new ArrayList<>();


    public List<String> removeDuplicate(String sentence){
       sentence = sentence.replaceAll("[\s+]", "");
       String[] chars = sentence.split("");

       List<String> distinctWords = Arrays.stream(chars).distinct().collect(Collectors.toList());

       return distinctWords;
    }

    public List<Character> sortChars(char character){
        chars.add(character);
        chars =  chars.stream().sorted().collect(Collectors.toList());

        return chars;
    }

    public List<Character> sortCharsAndRemoveDuplicates(char character){
        chars.add(character);
        chars =  chars.stream().distinct().sorted().collect(Collectors.toList());

        return chars;
    }

    public List<Character> sortCharsInDescending(char character){
        chars.add(character);
        chars =  chars.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        return chars;
    }

}
