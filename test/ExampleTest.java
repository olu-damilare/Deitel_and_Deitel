import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    Example example;
    @BeforeEach
    void setUp(){
        example = new Example();
    }

    @AfterEach
    void tearDown(){
        example = null;
    }

    @Test
    void test(){
        example.setNumber(1);
        assertEquals(1, example.getNumber());
    }
    @Test
    void test2(){
        example.setNumber(-1);
        assertEquals(0, example.getNumber());
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
        assertEquals(3, example.getNumber2());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber2());

    }

    @Test
    void test5(){
        example.setNumber(3);
        Example exam2 = new Example();


        System.out.println("test with first obj");
        assertEquals(3, example.getNumber());

        System.out.println("test with second obj");
        assertEquals(0, exam2.getNumber());
    }

    @Test
    void test6(){
        example.setNumber2(3);
        Example exam2 = new Example();


        System.out.println("test with first obj");
        assertEquals(3, example.getNumber2());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber2());
    }
    @Test
    void test7(){
        Example.setNumber3(3);
        Example exam2 = new Example();

        System.out.println("test with first obj");
        assertEquals(3, example.getNumber3());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber3());
    }

    @Test
    void test8(){
        example.setNumber4(3);
        Example exam2 = new Example();

        System.out.println("test with first obj");
        assertEquals(3, example.getNumber4());

        System.out.println("test with second obj");
        assertEquals(3, exam2.getNumber4());
    }
}