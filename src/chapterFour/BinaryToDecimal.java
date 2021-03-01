package chapterFour;

public class BinaryToDecimal {

    public int convertBinaryToDecimal(int binaryValue){
        int decimal = 0;
        int outerLoopCounter = 0;
        int innerLoopCounter = 0;
        int temporaryValue = 1;

        while(binaryValue > 0)
        {
            int remainderHolder = binaryValue % 10;

            if(remainderHolder == 1 && outerLoopCounter > 0 )
            {
                while (innerLoopCounter < outerLoopCounter) {
                    temporaryValue *= 2;
                    innerLoopCounter++;
                }
            }
            decimal += remainderHolder * temporaryValue;
            binaryValue /= 10;
            outerLoopCounter++;
        }
            return decimal;
    }
}
