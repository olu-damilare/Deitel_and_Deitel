package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class CheckProtection {
    private String[] oneToTwenty = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
                                    "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
                                    "EIGHTEEN", "NINETEEN", "TWENTY"};
    private String[] tens = {"THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHT", "NINETY"};

    public String writeCheck(String checkValue) {
        validateCheckValueFormat(checkValue);
        List<Character> charValues = getDigits(checkValue);

        StringBuilder writtenCheckValue = new StringBuilder();
        for (Character charValue : charValues) {
            writtenCheckValue.append(charValue);
        }

        double tempValue =  ((Integer.parseInt(writtenCheckValue.toString())) * 1.0)/100;
        writtenCheckValue.delete(0, writtenCheckValue.length());
        writtenCheckValue.append((String.format("%.2f",tempValue)));

        insertAsterisksAndSeparatingComma(writtenCheckValue);

        return writtenCheckValue.toString();

    }

    private void insertAsterisksAndSeparatingComma(StringBuilder sb) {
        int asteriskLimit =  5 - sb.substring(0, sb.length() - 3).length();
        for (int i = 0; i < asteriskLimit; i++) {
            sb.insert(0, '*');
        }
        if(asteriskLimit < 2)
            sb.insert(2, ',');
        else sb.insert(0, '*');
    }

    private List<Character> getDigits(String checkValue) {
        List<Character> charValues = new ArrayList<>();
        for (int i = 0; i < checkValue.length(); i++) {
            if(Character.isDigit(checkValue.charAt(i)))
                charValues.add(checkValue.charAt(i));
        }
        return charValues;
    }

    private void validateCheckValueFormat(String checkValue) {
        if (!(checkValue.matches("\\d{1,2}[,]\\d{3}[.]\\d{1,2}") || checkValue.matches("\\d{0,3}[.]\\d{1,2}")))
            throw new IllegalArgumentException("Invalid value format. Check value should be in the format \"12,345.67\"");
    }

    private String writeAmountLessThanOneInWords(double amount) {
        String stringValue = String.valueOf(amount);
        String[] values = stringValue.split("\\.");

        if(values[1].charAt(0) == '0') return values[1] + "/" + 1000;
        else if(values[1].length() == 1) return values[1] + "/" + 10;
        else return values[1] + "/" + 100;

    }


    private String writeAmountLessThanTwoInWords(double amount) {
        String stringValue = String.valueOf(amount);
        String[] values = stringValue.split("\\.");
        int intValue = Integer.parseInt(values[0]);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= intValue; i++) {
            if(i == intValue) {
                sb.append(oneToTwenty[i - 1]).append(" and ");
                break;
            }
        }

        return sb.append(writeAmountLessThanOneInWords(amount)).toString();
    }

    private String writeAmountLessThanHundred(double amount) {
        String stringValue = String.valueOf(amount);
        String[] values = stringValue.split("\\.");
        int intValue = Integer.parseInt(values[0]);
        int tenthValue = intValue / 10;
        int unitValue = intValue % 10;

        StringBuilder sb = new StringBuilder();
        appendWordsByValueOf(intValue, tenthValue, unitValue, sb);

        if (unitValue != 0 && tenthValue != 1)
             sb.append(oneToTwenty[unitValue - 1]).append(" and ").append(writeAmountLessThanOneInWords(amount));
        else
             sb.append("and ").append(writeAmountLessThanOneInWords(amount));

        return sb.toString();
    }

    private void appendWordsByValueOf(int intValue, int tenthValue, int unitValue, StringBuilder sb) {
        if (tenthValue == 2)
            sb.append(oneToTwenty[19]).append(' ');
        else if(tenthValue == 1)
            for (int i = 0; i < 10; i++) {
                if(i == unitValue)
                    sb.append(oneToTwenty[intValue - 1]).append(" ");
            }
        for (int i = 3; i < 10; i++) {
            if (tenthValue == i) {
                sb.append(tens[i - 3]).append(" ");
                break;
            }
             }
    }

    private String writeAmountLessThanThousandInWords(double amount) {
        String stringValue = String.valueOf(amount);
        String[] values = stringValue.split("\\.");
        int intValue = Integer.parseInt(values[0]);
        int hundredthValue = intValue / 100;
        int tenthValue = (intValue % 100) / 10;
        int unitValue = intValue % 10;

        StringBuilder stringAmount = new StringBuilder();

        appendWordsByNumericValuesOf(hundredthValue, tenthValue, unitValue, stringAmount);

        stringAmount.append(writeAmountLessThanHundred(Double.parseDouble(tenthValue + (unitValue + ".") + values[1])));

       return stringAmount.toString();
    }

    private void appendWordsByNumericValuesOf(int hundredthValue, int tenthValue, int unitValue, StringBuilder sb) {
        if(tenthValue == 0 && unitValue == 0)
        sb.append(oneToTwenty[hundredthValue -1]).append(" HUNDRED ");

        else
        sb.append(oneToTwenty[hundredthValue -1]).append(" HUNDRED and ");
    }

    public String writeAmountInWords(double amount){
        validateAmount(amount);
        String stringValue = String.valueOf(amount);
        String[] values = stringValue.split("\\.");
        int intValue = Integer.parseInt(values[0]);

        if(intValue > 99)
            return writeAmountLessThanThousandInWords(amount);
        else if(intValue >= 2)
            return writeAmountLessThanHundred(amount);
        else if(intValue == 1)
            return writeAmountLessThanTwoInWords(amount);

        else return writeAmountLessThanOneInWords(amount);
    }

    private void validateAmount(double amount) {
        if(!String.valueOf(amount).matches("\\d{1,3}[.]\\d{1,2}"))
            throw new IllegalArgumentException("Amount must be less than 1000 and two decimal places.");
    }
}
