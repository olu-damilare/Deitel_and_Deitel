package Exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryPackTest {

    @Test
    void test(){
        assertEquals((Integer)0, BinaryPack.convert(new ArrayList<Integer>(Arrays.asList(0,0,0))));
    }
}
