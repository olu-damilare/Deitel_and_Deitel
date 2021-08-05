package chapterTwentyOne;

import java.util.Comparator;
import java.util.LinkedList;

public class SortedList {

    public static void addToSortedList(Integer value, LinkedList<Integer> list){
        list.addFirst(value);
        list.sort(Comparator.naturalOrder());
    }


}
