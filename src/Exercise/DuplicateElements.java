package Exercise;

import java.util.ArrayList;

public class DuplicateElements {

    public static int eliminateDuplicates(int... numbers) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        if(numbers.length == 0)
            return 0;
        else
            for (int number : numbers)
                if (!uniqueNumbers.contains(number))
                    uniqueNumbers.add(number);
        return uniqueNumbers.size();
    }
}
