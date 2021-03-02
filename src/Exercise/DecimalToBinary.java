package Exercise;

public class DecimalToBinary {
    private String StringBinary;
    private String reversedBinary;
    private int binary;

    public void convertEvenDecimalToBinary(int evenDecimalNumber) {
        if (evenDecimalNumber % 2 == 0) {
            evenDecimalNumber += 1;

            reversedBinary = "";
            while (evenDecimalNumber > 0) {
                reversedBinary += evenDecimalNumber % 2;
                evenDecimalNumber /= 2;
            }

            flipTheReverseOfTheBinary();
            binary = Integer.parseInt(StringBinary) - 1;
        }
    }

        public void flipTheReverseOfTheBinary(){
            int integerOfReversedBinary = Integer.parseInt(reversedBinary);

            StringBinary = "";
            while(integerOfReversedBinary > 0){
                StringBinary += integerOfReversedBinary % 10;
                integerOfReversedBinary /= 10;
            }

        }

    public void convertOddDecimalToBinary(int oddDecimalNumber){

        if (oddDecimalNumber % 2 == 1) {
            reversedBinary = "";
            while (oddDecimalNumber > 0) {
                reversedBinary += oddDecimalNumber % 2;
                oddDecimalNumber /= 2;
            }
            flipTheReverseOfTheBinary();
            binary = Integer.parseInt(StringBinary);
        }
    }

    public int convertDecimalToBinary(int decimalNumber){
        convertEvenDecimalToBinary(decimalNumber);
        convertOddDecimalToBinary(decimalNumber);

        return binary;
    }
}
