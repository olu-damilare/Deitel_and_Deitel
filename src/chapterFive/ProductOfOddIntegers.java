package chapterFive;

public class ProductOfOddIntegers {

    public void calculateProductOfOddIntegers(int maximumNumber){
        int product = 1;
        for (int i = 1; i <= maximumNumber; i++) {
            if(i % 2 == 1)
                product *= i;
        }
        System.out.println(product);
    }

}
