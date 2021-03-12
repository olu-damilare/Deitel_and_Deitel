import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClasses.Example;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    Example calculations;
    @BeforeEach
    void setUp(){
        calculations = new Example();
    }

    @AfterEach
    void tearDown(){
        calculations = null;
    }

    @Test
    void test(){
        calculations.setNumber(1);
        assertEquals(1, calculations.getNumber());
    }
    @Test
    void test2(){
        calculations.setNumber(-1);
        assertEquals(0, calculations.getNumber());
    }

    @Test
    void test3(){
        Example.setNumber2(2);
        assertEquals(2, Example.getNumber2());
    }

    @Test
    void test4(){
        Example.setNumber2(3);
        Example exam2 = new Example();
//        example.setNumber2(3);
        System.out.println("test with first obj");
        assertEquals(3, calculations.getNumber2());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber2());

    }

    @Test
    void test5(){
        calculations.setNumber(3);
        Example exam2 = new Example();


        System.out.println("test with first obj");
        assertEquals(3, calculations.getNumber());

        System.out.println("test with second obj");
        assertEquals(0, exam2.getNumber());
    }

    @Test
    void test6(){
        calculations.setNumber2(3);
        Example exam2 = new Example();


        System.out.println("test with first obj");
        assertEquals(3, calculations.getNumber2());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber2());
    }
    @Test
    void test7(){
        Example.setNumber3(3);
        Example exam2 = new Example();

        System.out.println("test with first obj");
        assertEquals(3, calculations.getNumber3());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber3());
    }

    @Test
    void test8(){
        calculations.setNumber4(3);
        Example exam2 = new Example();

        System.out.println("test with first obj");
        assertEquals(3, calculations.getNumber4());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber4());
    }
    @Test
    void test9(){
        calculations.setNumber6(7);
        assertEquals(7, calculations.getNumber6());
    }
}