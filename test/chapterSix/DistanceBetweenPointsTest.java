package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceBetweenPointsTest {

    @BeforeEach
    void setUp(){
        DistanceBetweenPoints distance = new DistanceBetweenPoints();
    }

    @Test
    void testToSetXCoordinateOfPointA(){
        DistanceBetweenPoints.setCoordinatesOfPointA(2,3);
        assertEquals(2, DistanceBetweenPoints.getXCoordinateOfPointA());
    }
    @Test
    void testToSetYCoordinateOfPointA(){
        DistanceBetweenPoints.setCoordinatesOfPointA(2,3);
        assertEquals(3, DistanceBetweenPoints.getYCoordinateOfPointA());
    }
    @Test
    void testToSetXCoordinateOfPointB(){
        DistanceBetweenPoints.setCoordinatesOfPointB(4,5);
        assertEquals(4, DistanceBetweenPoints.getXCoordinateOfPointB());
    }
    @Test
    void testToSetYCoordinateOfPointB(){
        DistanceBetweenPoints.setCoordinatesOfPointB(4,5);
        assertEquals(5, DistanceBetweenPoints.getYCoordinateOfPointB());
    }
    @Test
    void testToCalculateHorizontalDistance(){
        DistanceBetweenPoints.setCoordinatesOfPointA(2,3);
        DistanceBetweenPoints.setCoordinatesOfPointB(4,5);

        DistanceBetweenPoints.calculateHorizontalDistance();
        assertEquals(4, DistanceBetweenPoints.getHorizontalDistance());
    }
    @Test
    void testToCalculateVerticalDistance(){
        DistanceBetweenPoints.setCoordinatesOfPointA(2,3);
        DistanceBetweenPoints.setCoordinatesOfPointB(4,5);

        DistanceBetweenPoints.calculateVerticalDistance();
        assertEquals(4, DistanceBetweenPoints.getVerticalDistance());
    }

    @Test
    void testToCalculateDistanceBetweenTwoPoints(){
        DistanceBetweenPoints.setCoordinatesOfPointA(9,7);
        DistanceBetweenPoints.setCoordinatesOfPointB(3,2);

        assertEquals(7.810249675906654, DistanceBetweenPoints.calculateDistance());
    }
}
