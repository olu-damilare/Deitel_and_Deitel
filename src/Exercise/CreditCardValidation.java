package Exercise;

public class CreditCardValidation {

    public int calculateSumOfDoubleEvenPlace(long creditCardNumber) {
        char[] arrayNums = String.valueOf(creditCardNumber).toCharArray();
        int sum = 0;
        for (int i = arrayNums.length - 2; i >= 0; i-=2) {
            sum += getDigit(arrayNums[i]);
        }
        return sum;
    }

    private int getDigit(char arrayNum) {
        int tempSum = 2 * Character.getNumericValue(arrayNum);
        if(tempSum < 10)
            return tempSum;
        else
            return (tempSum / 10) + (tempSum % 10);

    }

    public int calculateSumOfOddPlace(long creditCardNumber) {
        char[] arrayNums = String.valueOf(creditCardNumber).toCharArray();
        int sum = 0;
        for (int i = arrayNums.length - 1; i >= 0; i-=2) {
            sum += Character.getNumericValue(arrayNums[i]);
        }
        return sum;
    }

    public boolean isValid(long creditCardNumber) {
        return (calculateSumOfDoubleEvenPlace(creditCardNumber) + calculateSumOfOddPlace(creditCardNumber)) % 10 == 0;
    }
}
