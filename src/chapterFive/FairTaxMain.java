package chapterFive;

import java.util.Scanner;

public class FairTaxMain {
    public static void main(String[] args) {

        FairTax fairTax = new FairTax();

        String message = """
                Your expenses are distributed among the following categories below;
                Please select a category of expense to report:
                
                Press 1 for Housing
                Press 2 for Clothing
                Press 3 for Food
                Press 4 for vacation
                Press 5 for Transportation
                Press 6 for Education
                Press 7 for HealthCare
                Press 0 to exit and obtain Fair Tax Value.
                """;

        System.out.println(message);
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        while(userInput != 0) {
            switch (userInput) {
                case 1 -> userSetExpense(fairTax, input);
                case 2 -> userSetExpense(fairTax, input);
                case 3 -> userSetExpense(fairTax, input);
                case 4 -> userSetExpense(fairTax, input);
                case 5 -> userSetExpense(fairTax, input);
                case 6 -> userSetExpense(fairTax, input);
                case 7 -> userSetExpense(fairTax, input);
                default -> System.out.println("Invalid input");

            }
            System.out.println(message);
            userInput = input.nextInt();
        }

        System.out.printf("Your Fair Tax cost for this month is %.2f", fairTax.CalculateTax());

    }

    private static void userSetExpense(FairTax fairTax, Scanner input) {
        System.out.println("Please input the expense incurred on this category for the month");
        double expense = input.nextDouble();
        if(expense > 0)
        fairTax.setExpense(expense);
        else System.out.println("Invalid expense value");
    }
}
