package chapterSixteen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDuplicateWords {

    public int countDuplicate(String string) {
        string = string.toLowerCase();
        String[] words = string.split(" ");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        return words.length - uniqueWords.size();
    }

    public static void main(String[] args) {
        String string = "The fetch. the locate the found seven fetch";
        String[] words = string.split("[ .]");
        System.out.println(Arrays.toString(words));
    }
}
