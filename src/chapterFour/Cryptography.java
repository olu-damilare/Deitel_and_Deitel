package chapterFour;

public class Cryptography {

    public String encode(int number) {
        int fourthValue = 0;
        int thirdValue = 0;
        int secondValue = 0;
        int thirdValueHolder;
        int fourthValueHolder;
        String newValue = "";
        if (number >= 1000 && number <= 9999) {
            int counter = 1;
            while (counter <= 4) {
                if (number >= 1000) {
                    fourthValue = ((number + 7) % 10);
                    number /= 10;
                } else if (number >= 100) {
                    thirdValue = ((number + 7) % 10);
                    number /= 10;
                } else if (number >= 10) {
                    secondValue = ((number + 7) % 10);
                    number /= 10;
                    number += 7;
                }
                counter++;
            }

            thirdValueHolder = thirdValue;
            thirdValue = number;
            number = thirdValueHolder;

            fourthValueHolder = fourthValue;
            fourthValue = secondValue;
            secondValue = fourthValueHolder;

            newValue = number + "" + secondValue + "" + thirdValue + "" + fourthValue;

        }
        return newValue;
    }

}
