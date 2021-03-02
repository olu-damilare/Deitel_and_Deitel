package Exercise;

public class DecimalToBinary {
    private String binary;
    private String reversedBinary;

    public void convertDecimalToReversedBinary(int decimalNumber) {
        reversedBinary = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            reversedBinary += remainder;

            decimalNumber /= 2;
        }
    }
        public String flipReversedBinary() {
           binary = "";
            int number = Integer.parseInt(reversedBinary);

            while(number > 0) {
                binary += number % 10;

                number /= 10;
//                if (number == 0)
//                    binary += number;
            }
            return binary;

        }
}
