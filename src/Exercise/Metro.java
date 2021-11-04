package Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int remaining = 0;
        for(int[] people: stops){
            remaining += people[0];
            remaining -= people[1];
        }
        return remaining;
    }

    public static void main(String[] args) {
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        String value = "anagram";
        String secondValue = "anagra";
        count(firstMap, value);
        count(secondMap, secondValue);

        for (int i = 0; i < value.length(); i++) {
            if(firstMap.containsKey(value.charAt(i)) && secondMap.containsKey(value.charAt(i))){
                if(firstMap.get(value.charAt(i)).equals(secondMap.get(value.charAt(i)))){

                }else{
                    System.out.println(false);
                    return;
                }
            }else{
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
        }

    private static void count(Map<Character, Integer> map, String value) {
        for (int i = 0; i < value.length(); i++) {
           if(map.get(value.charAt(i)) != null) {
               int count = map.get(value.charAt(i));
               map.put(value.charAt(i), count + 1);
           }
            map.putIfAbsent(value.charAt(i), 1);

        }
    }
}


