package Exercise;

import java.util.Arrays;
import java.util.List;

public class DaysOfWeek {

    public static String getDay(String day, int numberOfDaysAfter){
        List<String> days = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        numberOfDaysAfter = numberOfDaysAfter % 7;
        int index = days.indexOf(day);

        if(index +numberOfDaysAfter < days.size())
            return days.get(numberOfDaysAfter + index);

        for (int i = index; i < index + numberOfDaysAfter; i++) {


            if(numberOfDaysAfter == 0){
                numberOfDaysAfter = i;
                break;
            }
            if(i == days.size() - 1){
                i = -1;
            }
            numberOfDaysAfter--;

        }
        return days.get(numberOfDaysAfter);
    }


}
