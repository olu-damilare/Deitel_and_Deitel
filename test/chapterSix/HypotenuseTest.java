package chapterSix;

import org.junit.jupiter.api.*;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {



    @Test
    void testThatMethodCalculatesTheSquareOfASide(){
      assertEquals(4, Hypotenuse.calculateSquareOfSide(2));
      assertEquals(20.25, Hypotenuse.calculateSquareOfSide(4.5));
    }

    @Test
    void testThatMethodAddsTheSquareOfBothSides(){
        double side1 = 3;
        double side2 = 2;
        assertEquals(13, Hypotenuse.calculateSumOfSidesSquared(side1, side2));
    }

    @Test
    void testThatMethodCalculatesHypotenuse(){
        double side1 = 3;
        double side2 = 4;

        assertEquals(5, Hypotenuse.calculateHypotenuse(side1, side2));
        assertEquals(10, Hypotenuse.calculateHypotenuse(6, 8));

    }
}
