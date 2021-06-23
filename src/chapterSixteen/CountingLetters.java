package chapterSixteen;

import java.util.*;

public class CountingLetters {
    private Map<Character, Integer> map = new HashMap<>();
    private Set<Character> keys;

    public void count(String value) {
        value = value.toLowerCase();
        char[] letters = value.toCharArray();

        for (char letter : letters) {
            if (Character.toString(letter).matches("d[0-9]*|[A-Za-z]*")) {
                if (map.containsKey(letter)) {
                    int count = map.get(letter);
                    map.put(letter, count + 1);
                } else {
                    map.put(letter, 1);
                }
            }
        }

    }

    public String displayCounts() {
        keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        StringBuilder output = new StringBuilder("Map contains\nKey Value\n");

        for (char key : sortedKeys) {
            output.append("  ").append(key).append(" ").append(map.get(key)).append("\n");
        }
        return output.toString();
    }




}
