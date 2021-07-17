package chapterTwenty.GenericMethod;

import java.util.ArrayList;

public class GenericMethod {


    public static  <T> ArrayList<T> subArray(T[] inputArray, int lowSubscript, int highSubscript) {
        if(lowSubscript < 0 || lowSubscript >= inputArray.length)
            throw new InvalidSubscriptException("value of low subscript should not be less than 0");
        if(highSubscript < 0 ||highSubscript >= inputArray.length)
            throw new InvalidSubscriptException("value of high subscript should not be less than 0");
        if(highSubscript < lowSubscript)
            throw new InvalidSubscriptException("value of high subscript should not be lower than low subscript");


        ArrayList<T> newList = new ArrayList<T>();
        for (int i = lowSubscript; i <= highSubscript; i++) {
                newList.add(inputArray[i]);
        }

        return newList;
    }
}
