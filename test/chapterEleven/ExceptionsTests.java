package chapterEleven;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionsTests {

    @Test
    void testThatMethodThrowsExceptionA() {
        assertThrows(ExceptionA.class, () -> {Exceptions.throwExceptionA();});
        try{
            Exceptions.throwExceptionA();
        }catch(ExceptionA ex){
            System.out.println(ex.getMessage());   ;
        }
    }

    @Test
    void testThatMethodThrowsExceptionB() {
        assertThrows(ExceptionB.class, () -> {Exceptions.throwExceptionB();});
        try{
            Exceptions.throwExceptionB();
        }catch(ExceptionB ex){
            System.out.println(ex.getMessage());   ;
        }
    }

    @Test
    void testThatMethodThrowsCheckedAndUncheckedExceptions() throws Exception {
        assertThrows(Exception.class, () -> {Exceptions.throwExceptions(1);});

        for (int i = 1; i < 5; i++) {
            try{
                Exceptions.throwExceptions(i);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

    }
}
