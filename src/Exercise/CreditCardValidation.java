package Exercise;

public class CreditCardValidation {

    private int calculateSumOfDoubleEvenPlace(long creditCardNumber) {
        String numsToString = String.valueOf(creditCardNumber);
        int sum = 0;
        for (int i = numsToString.length() - 2; i >= 0; i -= 2) {
           sum += getDigit(numsToString.charAt(i));
        }
        return sum;
    }

    private int getDigit(char character) {
        int tempSum = 2 * Character.getNumericValue(character);
        if(tempSum < 10)
            return tempSum;
        else
            return (tempSum / 10) + (tempSum % 10);
    }

    private int calculateSumOfOddPlace(long creditCardNumber) {
        String nums = String.valueOf(creditCardNumber);
        int sum = 0;
        for (int i = nums.length() - 1; i >= 0; i-=2) {
            sum += Character.getNumericValue(nums.charAt(i));
        }
        return sum;
    }

    public boolean isValid(long creditCardNumber) {
        return (calculateSumOfDoubleEvenPlace(creditCardNumber) + calculateSumOfOddPlace(creditCardNumber)) % 10 == 0;
    }
}
