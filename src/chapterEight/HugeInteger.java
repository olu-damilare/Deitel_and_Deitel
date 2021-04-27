package chapterEight;

import java.math.BigInteger;

public class HugeInteger {
    private int[] digits = new int[40];

    public static BigInteger add(HugeInteger firstHugeInteger, HugeInteger secondHugeInteger) {
        return firstHugeInteger.getValue().add(secondHugeInteger.getValue());
    }

    public static BigInteger subtract(HugeInteger firstHugeInteger, HugeInteger secondHugeInteger) {
        return firstHugeInteger.getValue().subtract(secondHugeInteger.getValue());
    }

    public static BigInteger product(HugeInteger firstHugeInteger, HugeInteger secondHugeInteger) {
        return firstHugeInteger.getValue().multiply(secondHugeInteger.getValue());
    }

    public static BigInteger divide(HugeInteger firstHugeInteger, HugeInteger secondHugeInteger) {
        return firstHugeInteger.getValue().divide(secondHugeInteger.getValue());
    }

    public static BigInteger remainder(HugeInteger firstHugeInteger, HugeInteger secondHugeInteger) {
        return firstHugeInteger.getValue().remainder(secondHugeInteger.getValue()) ;
    }

    public void parse(String number) {
        int positionCounter = digits.length;
        for (int i = number.length() - 1; i >= 0; i--)
          digits[--positionCounter] = Integer.parseInt(String.valueOf(number.charAt(i)));
    }

    public BigInteger getValue() {
        StringBuilder value = new StringBuilder();
        for (int digit : digits) {
            value.append(digit);
        }
        return new BigInteger(value.toString());
    }

    public boolean isEqualTo(HugeInteger hugeInteger) {
        return getValue().equals(hugeInteger.getValue());
    }

    public boolean isNotEqualTo(HugeInteger hugeInteger) {
        return !getValue().equals(hugeInteger.getValue());
    }

    public boolean isGreaterThan(HugeInteger hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == 1;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == 1 || getValue().compareTo(hugeInteger.getValue()) == 0;
    }

    public boolean isLessThan(HugeInteger hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == -1;
    }

    public boolean isLessThanOrEqualTo(HugeInteger hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == -1 || getValue().compareTo(hugeInteger.getValue()) == 0;
    }

    public boolean isZero() {
        return getValue().equals(BigInteger.valueOf(0));
    }
}
