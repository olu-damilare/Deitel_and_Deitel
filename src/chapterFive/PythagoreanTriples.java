package chapterFive;


public class PythagoreanTriples {
    public static void main(String[] args) {
        int limit = 500;
        System.out.println("side1 \t side2 \t Hypotenuse");
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                for (int k = 1; k <= limit; k++) {
                    if((i * i) + (j * j) == (k * k)){
                        System.out.println(i + "\t\t" + j + "\t\t" + k);
                    }
                }
            }
        }


    }
}
