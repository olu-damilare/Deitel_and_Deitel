package tddClasses;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        MyAccount damiAccount =  new MyAccount(123456);
        MyAccount beneficiaryAccount = new MyAccount(234567);

        String atmMessage= "";
        System.out.println("Please enter a 4-digit number to create your pin");
        Scanner input = new Scanner(System.in);
        int userPin = input.nextInt();
        if(userPin >= 1000 && userPin <=9999) {
            damiAccount.setPin(userPin);

            while (true) {
                String pinRequest = "Please enter your pin";
                System.out.println(pinRequest);
                userPin = input.nextInt();

                if (userPin != damiAccount.getPin())
                {
                    for (int i = 0; i < 3 ; i++)
                    {
                        System.out.println("Invalid pin, try again");
                        userPin = input.nextInt();

                        if(userPin == damiAccount.getPin())
                            break;

                    }

                    }
                 else {
                    System.out.println();
                    atmMessage = """
                            Welcome,
                            --> Press 1 to deposit.
                            --> Press 2 to withdraw.
                            --> Press 3 to transfer.
                            --> Press 4 to check balance.
                            --> Press 5 to recharge.
                            --> Press 6 to change pin.
                            --> Press 0 to exit.
                            """;
                    System.out.println(atmMessage);

                    int userChoice = input.nextInt();
                    if (userChoice == 0)
                        break;
                    else {
                        switch (userChoice) {
                            case 1:
                                System.out.println("How much do you want to deposit");
                                double depositAmount = input.nextDouble();
                                damiAccount.deposit(depositAmount);
                                System.out.println("Transaction successful");
                                break;
                            case 2:
                                System.out.println("How much do you want to withdraw");
                                double withdrawAmount = input.nextDouble();
                                if (withdrawAmount > 0) {
                                    if (damiAccount.getBalance() >= withdrawAmount) {
                                        damiAccount.withdraw(withdrawAmount, userPin);
                                        System.out.println("Transaction successful");
                                        break;
                                    }
                                    else {
                                        System.out.println("Insufficient funds");
                                        break;
                                    }
                                } else
                                    System.out.println("Invalid amount");
                                break;
                            case 3:
                                System.out.println("Enter beneficiary account number");
                                int beneficiaryAccountNumber = input.nextInt();

                                if (beneficiaryAccountNumber == beneficiaryAccount.getAccountNumber()) {
                                    System.out.println("How much do you want to transfer");
                                    double transferAmount = input.nextDouble();
                                    if (transferAmount > 0) {
                                        if (damiAccount.getBalance() >= transferAmount) {
                                            damiAccount.transfer(transferAmount, userPin);
                                            beneficiaryAccount.deposit(transferAmount);
                                            System.out.println("Transaction successful");
                                            break;

                                        } else {
                                            System.out.println("Insufficient funds");
                                            break;
                                        }
                                    } else
                                        System.out.println("Invalid amount");
                                    break;
                                } else
                                    System.out.println("Invalid account number");
                                    break;
                            case 4:
                                System.out.println("Your account balance is " + damiAccount.getBalance());
                                break;
                            case 5:
                                System.out.println("Enter beneficiary phone number");
                                int beneficiaryPhoneNumber = input.nextInt();
                                System.out.println("Transaction successful");
                                break;
                            case 6:
                                System.out.println("Please input your new pin");
                                userPin = input.nextInt();
                                damiAccount.setPin(userPin);
                                System.out.println("Pin changed successfully");
                                break;
                            default:
                                System.out.println("Invalid selection");
                        }
                    }
                    System.out.println();
                    System.out.println("""
                            Do you want to perform another transaction?
                             Press 1 to continue
                             Press 0 to exit
                             """);

                    userChoice = input.nextInt();
                    if (userChoice == 0)
                        break;

                    while (userChoice != 0 && userChoice != 1) {
                            System.out.println("Invalid input, try again");
                        userChoice = input.nextInt();

                    }
                }
            }
        }
        else
            System.out.println("Invalid input");
    }
}
