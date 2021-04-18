package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void testThatRectangleHasALength(){
        Rectangle rectangle = new Rectangle();
        double length = 5.0;
        rectangle.setLength(length);
        assertEquals(length, rectangle.getLength());
    }

    @Test
    void testThatRectangleHasAWidth(){
        Rectangle rectangle = new Rectangle();
        double width = 5.0;
        rectangle.setWidth(width);
        assertEquals(width, rectangle.getWidth());
    }
    @Test
    void testThatRectangleAreaCanBeCalculated(){
        Rectangle rectangle = new Rectangle();
        double width = 5.0;
        rectangle.setWidth(width);
        double length = 5.0;
        rectangle.setLength(length);
        assertEquals(25, rectangle.calculateArea());
    }
    @Test
    void testThatRectanglePerimeterCanBeCalculated(){
        Rectangle rectangle = new Rectangle();
        double width = 5.0;
        rectangle.setWidth(width);
        double length = 5.0;
        rectangle.setLength(length);
        assertEquals(20, rectangle.calculatePerimeter());
    }



}
