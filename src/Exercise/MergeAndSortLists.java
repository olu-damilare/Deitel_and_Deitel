package Exercise;

public class MergeAndSortLists {


 public static int[] mergeSortedLists(int[] firstList, int[] secondList){
     if(firstList == null && secondList == null) return new int[]{};
     else if((secondList == null || secondList.length == 0) && firstList != null) return firstList;
     else if(firstList == null || firstList.length == 0) return secondList;

     int[] newList = new int[firstList.length + secondList.length];

     int firstListCounter = 0;
     int secondListCounter = 0;
     int newListCounter = 0;

    while(firstListCounter < firstList.length && secondListCounter < secondList.length){
        if(firstList[firstListCounter] > secondList[secondListCounter]){
            newList[newListCounter] = secondList[secondListCounter];
            secondListCounter++;
        }
        else{
            newList[newListCounter] = firstList[firstListCounter];
            firstListCounter++;
        }
        newListCounter++;
    }

    if(firstListCounter < firstList.length){
        for (int i = firstListCounter; i < firstList.length; i++) {
            newList[secondList.length + i] = firstList[i];
        }
    }else if(secondListCounter < secondList.length){
        for (int i = secondListCounter; i < secondList.length; i++) {
            newList[firstList.length + i] = secondList[i];
        }
    }
    return newList;

    }

}
