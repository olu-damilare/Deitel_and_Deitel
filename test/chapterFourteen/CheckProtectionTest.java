package chapterFourteen;

import org.junit.jupiter.api.Test;

public class CheckProtectionTest {

    @Test
    void testToImplementCheckProtection(){
        CheckProtection checkProtection = new CheckProtection();
        System.out.println(checkProtection.writeCheck("0.4")); ;
    }
}
