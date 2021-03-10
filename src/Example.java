public class Example {
    private static int number3;

    private int number;
    private static int number2;
    private static int number4;

    public static void setNumber2(int number2) {
        if (number2 > 0) {
            Example.number2 = number2;
        }
    }

    public static int getNumber2() {
        return number2;
    }

    public static void setNumber3(int number) {
        if (number > 0) {
            Example.number3 = number;
        }
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }

        Example.setNumber2(2);
    }

    public int getNumber() {
        return number;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber4(int number4) {
        Example.number4 = number4;
    }

    public int getNumber4() {
        return number4;
    }
}
