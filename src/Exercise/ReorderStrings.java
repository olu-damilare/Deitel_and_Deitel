package Exercise;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Scanner;

public class ReorderStrings {

    public static String reorder(String... names) {
//        String[] arr = input.split("\\s+");
//        StringBuilder result = new StringBuilder("");
//        for (int i = 0; i < 10; i++) {
//            for (String s : arr) {
//                if (s.contains(String.valueOf(i))) {
//                    result.append(s).append(" ");
//                }
//            }
//        }
//        return result.toString().trim();
        //Do your magic here
        String whoLikesIt;
        if(names.length == 0) whoLikesIt = "no one likes this";
        else if(names.length == 1) whoLikesIt = names[0] + " likes this";
        else if(names.length == 2) whoLikesIt = names[0] + " and " + names[1] + " like this ";
        else if(names.length == 3) whoLikesIt = names[0] + ", " + names[1] + " and " + names[2] + " like this ";
        else{
            int otherPeople = 0;
            for(int i = 2; i < names.length; i++){
                otherPeople++;
            }
            whoLikesIt = names[0] + ", " + names[1] + " and " + otherPeople + " others like this ";

        }
        return whoLikesIt;
    }

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
//                String s ="            YES      leading spaces        are valid,    problemsetters are         evillllll";
                String s = "";
                // Write your code here.
                // String[] tokens = s.split("[.!?,'\\-\\s]+");
                String[] tokens = s.split("[\\s_[^\\w]]+");
                int length = tokens.length;
                if(length == 0) {
                    System.out.println(length);
                    return;
                }
                else if(tokens[0].length() > 0) {
                    System.out.println(length);
                    for (String token : tokens) {
                        System.out.println(token);
                    }
                }else{
                    length = tokens.length - 1;
                    System.out.println(length);
                    for (int i = 1; i < tokens.length; i++) {
                        System.out.println(tokens[i]);
                    }
                }
                scan.close();
            }

}

