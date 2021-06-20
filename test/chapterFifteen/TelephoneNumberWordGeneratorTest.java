package chapterFifteen;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelephoneNumberWordGeneratorTest {

    @Test
    void testThatNumberWordCanBeGeneratedFromTelephoneNumber(){
        TelephoneNumberWordGenerator generator = new TelephoneNumberWordGenerator();
        try {
            generator.generateWords("825-3688");
            assertTrue(generator.contains("TAKEOUT"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testThatPhoneNumberContainingNonDigitValue_throwsInputMismatchException(){
        TelephoneNumberWordGenerator generator = new TelephoneNumberWordGenerator();
        try {
            assertThrows(InputMismatchException.class, ()-> generator.generateWords("82a-3688"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testThatPhoneNumberContainingValue1_throwsInputMismatchException(){
        TelephoneNumberWordGenerator generator = new TelephoneNumberWordGenerator();
        try {
            assertThrows(InputMismatchException.class, ()-> generator.generateWords("821-3688"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testThatPhoneNumberContainingValue0_throwsInputMismatchException(){
        TelephoneNumberWordGenerator generator = new TelephoneNumberWordGenerator();
        try {
            assertThrows(InputMismatchException.class, ()-> generator.generateWords("820-3688"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
