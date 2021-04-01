package chapterSeven;

public class VargsProduct {
    public double arrayProduct(int... array) {
        int product = 1;
        for (int number : array) {
            product *= number;
        }
        return product;
    }
}
