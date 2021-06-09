package chapterSeven;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void sieveForPrime(boolean... values){
        Arrays.fill(values, true);
        for (int index = 2; index < values.length; index++) {
            if (values[index]) {
                int sumIndex = index * 2;
                while (sumIndex < values.length){
                    values[sumIndex] = false;
                    sumIndex += index;
                }
            }
        }

    }



    public static void main(String[] args) {
        boolean[] values = new boolean[1000];
        SieveOfEratosthenes.sieveForPrime(values);

        for (int i = 2; i < values.length; i++) {
            if(values[i])
                System.out.println(i);
        }

    }
}
