package chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();
        for (int i = 0; i < 10 ; i++) {
            for (int j = 9; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println();

        int spaces = 0;
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
            spaces++;
        }

        int space = 10;
        for (int i = 0; i <= space; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
          spaces--;
        }
    }

}
