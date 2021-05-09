package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class CheckProtection {
    public String writeCheck(String checkValue) {
        if (!checkValue.matches("(\\d[,]\\d*[.]\\d+ | \\d{0,3}[.]\\d{2}) "))
            throw new IllegalArgumentException("Invalid value format. Check value should be in the format \"12,345.67\"");

        List<Character> charValues = new ArrayList<>();
        for (int i = 0; i < checkValue.length(); i++) {
            if(Character.isDigit(checkValue.charAt(i)))
                charValues.add(checkValue.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charValues.size(); i++) {
            sb.append(charValues.get(i));
        }
        double tempValue =  ((Integer.parseInt(sb.toString())) * 1.0)/100;
        sb.delete(0, sb.length());
        sb.append(tempValue);
        int asteriskLimit =  5 - sb.substring(0, sb.length() - 3).length();
        for (int i = 0; i < asteriskLimit; i++) {
            sb.insert(0, '*');
        }
        if(asteriskLimit < 2)
            sb.insert(2, ',');
        else sb.insert(0, '*');

        return sb.toString();

    }

    public static void main(String[] args) {
        String value = "123";
        System.out.println(value.matches("\\d[3]"));
    }
}
