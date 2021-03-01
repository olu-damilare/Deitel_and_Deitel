package chapterFour;

public class FiveIntegarPalindrome {

    public void isPalindrome(int number) {
        int fifthValue = 0;
        int fourthValue = 0 ;
        int thirdValue = 0;
        int secondValue = 0;
        if (number >= 10000 && number <= 99999) {
            int counter = 1;
            while (counter <= 5) {
                if (number >= 10000) {
                    fifthValue = number % 10;
                    number /= 10;
                } else if (number >= 1000) {
                    fourthValue = number % 10;
                    number /= 10;
                } else if (number >= 100) {
                    thirdValue = number % 10;
                    number /= 10;
                } else if (number >= 10) {
                    secondValue = number % 10;
                    number /= 10;
                }
                counter++;
            }
            if (fifthValue == number && secondValue == fourthValue)
                System.out.println("Is palindrome");
            else
                System.out.println("Is not palindrome");

        }
        else
            System.out.println("Enter a valid five digit number");


    }
}


