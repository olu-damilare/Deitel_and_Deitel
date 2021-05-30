package Exercise;

import java.util.Scanner;

public class ATM {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        MyAccount myAccount =  new MyAccount(123456);
        MyAccount beneficiaryAccount = new MyAccount(234567);

        String atmMessage = "";
        System.out.println("Please enter a 4-digit number to create your pin");

        String userPin = input.next();

        if(userPin.length() == 4)
        {
            myAccount.setPin(userPin);
            System.out.println("Pin created successfully");

            while (true)
            {
                String pinRequest = "Please enter your pin";
                System.out.println(pinRequest);
                userPin = input.next();

                int pinTries = 1;
                if (!userPin.equals(myAccount.getPin()))
                {
                    do
                        {
                        System.out.println("Invalid pin, try again");
                        userPin = input.next();
                        if (userPin.equals(myAccount.getPin()))
                            break;
                        pinTries++;
                        } while (pinTries <= 2);
                }

                if(pinTries == 3)
                        break;

                 else
                     {
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
                    else
                        {
                             switch (userChoice) {
                                case 1 -> {
                                    System.out.println("How much do you want to deposit? ");
                                    double depositAmount = input.nextDouble();
                                    depositAmountIsValid(myAccount, depositAmount);
                                }
                                case 2 -> {
                                    System.out.println("How much do you want to withdraw?");
                                    double withdrawAmount = input.nextDouble();
                                    withdrawAmountIsValid(myAccount, userPin, withdrawAmount);
                                }
                                case 3 -> {
                                    System.out.println("Enter beneficiary account number");
                                    int beneficiaryAccountNumber = input.nextInt();
                                    validBeneficiaryAccount(myAccount, beneficiaryAccount, userPin, beneficiaryAccountNumber);
                                }
                                case 4 -> System.out.println("Your account balance is " + myAccount.getBalance());
                                case 5 -> {
                                    System.out.println("Enter beneficiary phone number");
                                    int beneficiaryPhoneNumber = input.nextInt();
                                    System.out.println("Transaction successful");
                                }
                                case 6 -> {
                                    System.out.println("Please input your new pin");
                                    userPin = input.next();
                                    myAccount.setPin(userPin);
                                    System.out.println("Pin changed successfully");
                                }
                                default -> System.out.println("Invalid selection");
                            }
                    }
                    System.out.println();
                    System.out.println("""
                            Do you want to perform another transaction?
                             Press 1 to continue
                             Press 0 to exit
                             """);

                    userChoice = input.nextInt();

                    while (userChoice != 0 && userChoice != 1)
                    {
                            System.out.println("""
                                    Invalid input, try again.
                                    Press 1 to continue
                                    Press 0 to exit""");
                            userChoice = input.nextInt();
                    }
                    if (userChoice == 0)
                        break;
                }
            }

        }
        else
            System.out.println("Invalid input");
    }

    private static void validBeneficiaryAccount(MyAccount myAccount, MyAccount beneficiaryAccount, String userPin, int beneficiaryAccountNumber) {
        if (beneficiaryAccountNumber == beneficiaryAccount.getAccountNumber()) {
            transferAmountIsValid(myAccount, beneficiaryAccount, userPin);
        }
        else
            System.out.println("Invalid account number");
    }

    private static void depositAmountIsValid(MyAccount myAccount, double depositAmount) {
        if(depositAmount > 0)
        {
            myAccount.deposit(depositAmount);
             System.out.println("Transaction successful");
        }
        else System.out.println("Invalid amount");
    }

    private static void withdrawAmountIsValid(MyAccount myAccount, String userPin, double withdrawAmount) {
        if (withdrawAmount > 0)
            withdrawAmountIsSufficient(myAccount, userPin, withdrawAmount);

        else System.out.println("Invalid amount");
    }

    private static void withdrawAmountIsSufficient(MyAccount myAccount, String userPin, double withdrawAmount) {
        if (myAccount.getBalance() >= withdrawAmount)
        {
            myAccount.withdraw(withdrawAmount, userPin);
            System.out.println("Transaction successful");
        }
        else System.out.println("Insufficient funds");

    }

    private static void transferAmountIsValid(MyAccount myAccount, MyAccount beneficiaryAccount, String userPin) {
        System.out.println("How much do you want to transfer?");
        double transferAmount = input.nextDouble();

        if (transferAmount > 0) transferAmountIsSufficient(myAccount, beneficiaryAccount, userPin, transferAmount);
        else System.out.println("Invalid amount");
    }

    private static void transferAmountIsSufficient(MyAccount myAccount, MyAccount beneficiaryAccount, String userPin, double transferAmount) {
        if (myAccount.getBalance() >= transferAmount) transferFunds(myAccount, beneficiaryAccount, userPin, transferAmount);
        else System.out.println("Insufficient funds");
        }

    private static void transferFunds(MyAccount myAccount, MyAccount beneficiaryAccount, String userPin, double transferAmount) {
        myAccount.transfer(transferAmount, userPin);
        beneficiaryAccount.deposit(transferAmount);
        System.out.println("Transaction successful");
    }
}
