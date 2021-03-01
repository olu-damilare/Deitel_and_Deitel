package Exercise;

public class FirstOneThousandCubes {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1000; i > number; i--) {
            int cube = i * i * i;
            System.out.println(cube);

        }
    }
}
