package chapterFour;

public class Cryptography {

    public int encrypt(int message) {
        if(message < 1000 || message > 9999)
            throw new IllegalArgumentException("message must be a four-digit number");
        int encryptedMessage;
        int fourthValue = 0;
        int thirdValue = 0;
        int secondValue = 0;

        for (int i = 0; i < 5; i++) {
            if (message >= 1000) {
                fourthValue = ((message + 7) % 10);
                message /= 10;
            } else if (message >= 100) {
                thirdValue = ((message + 7) % 10);
                message /= 10;
            } else if (message >= 10) {
                secondValue = ((message + 7) % 10);
                message /= 10;
                message = (message + 7) % 10;
            }
        }
        encryptedMessage = (thirdValue * 1000) + (fourthValue * 100) + (message * 10) + secondValue;
        return encryptedMessage;

    }

    public int decrypt(int message){
        int decryptedMessage = 0;
        int encryptedFourthValue = message % 10;
        int encryptedThirdValue = (message % 100) / 10;
        int encryptedSecondValue = (message / 100) % 10;
        int encryptedFirstValue = message / 1000;

        int decryptedFourthDigit = 0;
        int decryptedThirdDigit = 0;
        int decryptedSecondDigit = 0;
        int decryptedFirstDigit = 0;

        for (int j = 0; j < 10; j++) {
            if(((j + 7) % 10) == encryptedFourthValue)
                decryptedFourthDigit = j;
            if(((j + 7) % 10) == encryptedThirdValue)
                decryptedThirdDigit = j;
            if(((j + 7) % 10) == encryptedSecondValue)
                decryptedSecondDigit = j;
            if(((j + 7) % 10) == encryptedFirstValue)
                decryptedFirstDigit = j;
        }
        decryptedMessage = (decryptedThirdDigit * 1000) + (decryptedFourthDigit * 100) + ( decryptedFirstDigit * 10) + decryptedSecondDigit;
        return decryptedMessage;
    }

}
