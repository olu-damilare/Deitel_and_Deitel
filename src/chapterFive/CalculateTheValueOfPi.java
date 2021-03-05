package chapterFive;

public class CalculateTheValueOfPi {
    public static void main(String[] args) {
        int limit = 200000;
        int denominator = 1;
        double piValue = 0;
        int firstPiValue = 0;
        boolean foundPiValue = false;
        for (int i = 1; i <= limit ; i++) {
            if(i % 2 == 1)
                piValue += 4.0 / denominator;
            else
                piValue -=  4.0 / denominator;

            if((int) (piValue * 100000) == 314159 && !foundPiValue){
                firstPiValue = i;
                foundPiValue = true;
            }
            System.out.println(i + "\t" + piValue);
            denominator+=2;
        }
        System.out.println(firstPiValue);
    }
}
