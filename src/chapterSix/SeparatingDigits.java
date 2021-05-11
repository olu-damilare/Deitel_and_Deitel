package chapterSix;

public class SeparatingDigits {

    public static String separateDigits(int number){
       String stringValue = "";
       while(number > 0){
           int digit = number % 10;
           stringValue = digit + "  " + stringValue;
           number/=10;
       }
       return stringValue;
    }

}
