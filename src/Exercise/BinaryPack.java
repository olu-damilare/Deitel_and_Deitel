package Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryPack {

    public static Object convert(ArrayList<Integer> integers){
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < integers.size(); i++) {
         StringBuilder binaryElement = new StringBuilder(Integer.toBinaryString(integers.get(i)));
         while(binaryElement.length() < 8){
             binaryElement.insert(0, 0);
         }
            binary.insert(0, binaryElement.toString());
        }
      return Long.parseLong(binary.toString(), 2);

    }

    public static void main(String[] args) {
        System.out.println(BinaryPack.convert(new ArrayList<Integer>(Arrays.asList(24,85,0))));
    }


}
