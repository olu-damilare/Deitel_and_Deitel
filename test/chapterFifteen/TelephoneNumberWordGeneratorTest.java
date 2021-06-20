package chapterFifteen;

import org.junit.jupiter.api.Test;

public class TelephoneNumberWordGeneratorTest {

    @Test
    void testThatNumberWordCanBeGeneratedFromTelephoneNumber(){
        TelephoneNumberWordGenerator generator = new TelephoneNumberWordGenerator();
        generator.generateWords("825-3688");

    }
}
