package Exercise;

import java.util.ArrayList;

public class DuplicateElements {

    public static int eliminateDuplicates(int... numbers) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (int number : numbers) {
            uniqueElements.add(number);
        }

        for (int i = 0; i < uniqueElements.size(); i++) {
            for (int j = 0; j < uniqueElements.size(); j++) {
                if(i == j){}

                else if(uniqueElements.get(i).equals(uniqueElements.get(j)))
                    uniqueElements.remove(j);
            }
        }
        return uniqueElements.size();
    }
}
