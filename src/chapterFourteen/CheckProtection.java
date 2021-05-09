package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class CheckProtection {
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

}
