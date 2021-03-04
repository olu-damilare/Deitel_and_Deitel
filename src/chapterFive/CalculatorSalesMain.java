package chapterFive;

import java.util.Scanner;

public class CalculatorSalesMain {
    public static void main(String[] args) {
        CalculatingSales calculator = new CalculatingSales();
        double product = 0;
        String message = """
                Enter a number between 1 and 5 to select a product or press 0 to exit.
                Product 1 - $2.98
                Product 2 - $4.50
                Product 3 - $9.98
                Product 4 - $4.49
                Product 5 - $6.87
                """;
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        int productId = input.nextInt();

        while(productId != 0) {

            System.out.println("How many quantity of product " + productId + " do you want?");
            int productQuantity = input.nextInt();

            switch (productId) {
                case 1:
                    calculator.setPrice(2.98);
                    calculator.setQuantity(productQuantity);
                    product = calculator.product();
                    break;
                case 2:
                    calculator.setPrice(4.50);
                    calculator.setQuantity(productQuantity);
                    product = calculator.product();
                    break;
                case 3:
                    calculator.setPrice(9.98);
                    calculator.setQuantity(productQuantity);
                    product = calculator.product();
                    break;
                case 4:
                    calculator.setPrice(4.49);
                    calculator.setQuantity(productQuantity);
                    product = calculator.product();
                    break;
                case 5:
                    calculator.setPrice(6.87);
                    calculator.setQuantity(productQuantity);
                    product = calculator.product();
                default:
                    System.out.println("Invalid product ID");
            }
            System.out.println();
            System.out.println(message);
            productId = input.nextInt();
        }
        System.out.printf("The total cost of products sold is %.2f ", product);


    }
}
