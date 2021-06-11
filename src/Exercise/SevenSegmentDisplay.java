package Exercise;

import java.util.Arrays;

public class SevenSegmentDisplay {

    private int[][] values = new int[5][4];

    public String displayOutputs() {
        String output = "";
        for (int[] value : values) {
            for (int i : value) {
                if (i == 1)
                    output += "# ";
                else output += "  ";
            }
            output += '\n';
        }
        return output;
    }

    public void writeOnA(){
       Arrays.fill(values[0], 1);
    }
    public void writeOnB(){
        for (int i = 0; i < 3; i++) {
            values[i][3] = 1;
        }
    }

    public void writeOnC(){
        for (int i = 2; i < 5; i++) {
            values[i][3] = 1;
        }
    }

    public void writeOnD(){
        Arrays.fill(values[4], 1);
    }
    public void writeOnE(){
        for (int i = 2; i < 5; i++) {
            values[i][0] = 1;
        }
    }
    public void writeOnF(){
        for (int i = 0; i < 3; i++) {
            values[i][0] = 1;
        }
    }
    public void writeOnG(){
        Arrays.fill(values[2], 1);
    }

    public String display(String binaryDigit){
        if(binaryDigit.length() > 8){
            binaryDigit = binaryDigit.substring(0,8);
        }else if(binaryDigit.length() < 8){
            while(binaryDigit.length() <= 8) {
                binaryDigit = '0' + binaryDigit;
            }
        }
        if(binaryDigit.charAt(7) == '0')
            return "";
        char[] digits = binaryDigit.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != '1' && digits[i] != '0')
                throw new IllegalArgumentException("Invalid input. Provide binary digits only");
        }


        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '1'){
                switch (i) {
                    case 0 -> writeOnA();
                    case 1 -> writeOnB();
                    case 2 -> writeOnC();
                    case 3 -> writeOnD();
                    case 4 -> writeOnE();
                    case 5 -> writeOnF();
                    case 6 -> writeOnG();
                }
            }
        }

        return displayOutputs();
    }

    public int decimalToBinary(int decimalNumber) {
        int binaryNumber = 0;
        int multiplier = 1;
        while(decimalNumber > 0){
            binaryNumber += multiplier * (decimalNumber % 2);
            decimalNumber /= 2;
            multiplier *= 10;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        SevenSegmentDisplay bla = new SevenSegmentDisplay();
        System.out.println(bla.display("10111111111"));
    }
}
