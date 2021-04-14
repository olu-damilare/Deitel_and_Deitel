package Exercise;

import java.util.Arrays;

public class FindIntersection {

    public static String findIntersection(String[] array){
       String[] firstElementChars =  array[0].split(",", array[0].length());
        String[] secondElementChars =  array[1].split(",", array[1].length());
        Arrays.sort(firstElementChars);
        Arrays.sort(secondElementChars);
       String newString = "";

        for (String firstElementChar : firstElementChars)
            for (String secondElementChar : secondElementChars)
                if (firstElementChar.equals(secondElementChar))
                    newString += firstElementChar + ",";

        if(newString.length() > 0)
            return newString;
        else
        return "False";
    }

    public static void main(String[] args) {
        String firstString = "13,7,4,3,1";
        String secondString = "15,1,4,13,2";
        String[] stringArray = {firstString, secondString};
        System.out.println(FindIntersection.findIntersection(stringArray));   ;
    }
}
