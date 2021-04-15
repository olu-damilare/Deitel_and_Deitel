package Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

    public static String findIntersection(String[] array){
       String[] firstElementChars =  array[0].split(",", array[0].length());
       String[] secondElementChars =  array[1].split(",", array[1].length());
        ArrayList<Integer> arrayListOfInts = new ArrayList<>();
        for (String firstElementChar : firstElementChars)
            for (String secondElementChar : secondElementChars)
                if (firstElementChar.equals(secondElementChar))
                    arrayListOfInts.add(Integer.parseInt(firstElementChar));

        if(arrayListOfInts.size() == 0)
            return "false";

        int[] arrayOfInts = new int[arrayListOfInts.size()];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = arrayListOfInts.get(i);
        }
        Arrays.sort(arrayOfInts);

        StringBuilder newString = new StringBuilder();
        for (int i : arrayOfInts) {
            newString.append(i).append(",");
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String firstString = "13,7,4,3,1";
        String secondString = "15,1,4,13,2";
        String[] stringArray = {firstString, secondString};
        System.out.println(FindIntersection.findIntersection(stringArray));
    }
}
