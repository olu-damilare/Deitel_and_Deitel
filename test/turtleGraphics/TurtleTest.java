package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Turtle turtle;

    @BeforeEach
    void setUp(){
        pen = new Pen();
        turtle = new Turtle(pen);
    }

    @Test
    void testThatTurtleHasPen(){
        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
    }
    @Test
    void testThatTurtlePenIsUpByDefault(){
        assertTrue(turtle.isPenUp());
    }
    @Test
    void testThatTurtleCanMovePenDown(){
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    void testThatTurtleCanMovePenUp(){
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void testThatTurtleCanTurnRightWhenFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnRightWhenFacingSouth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnRightWhenFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnRightWhenFacingNorth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhenFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhenFacingNorth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhenFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhenFacingSouth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanMoveForwardWhenFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy( 10);
        assertEquals(new Position(9,0), turtle.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveForwardWhenFacingSouth(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(10);
        assertEquals(new Position(0,9), turtle.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveForwardWhenFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy( 10);
        assertEquals(new Position(9,0), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveForwardBy( 10);
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }
    @Test
    void testThatTurtleCanMoveForwardWhenFacingNorth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForwardBy( 6);
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.moveForwardBy( 3);
        assertEquals(new Position(0,3), turtle.getCurrentPosition());
    }
    @Test
    void testThatTurtleCanWriteOnSketchPadWhenFacingEast(){
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        int numberOfSteps = 6;
        turtle.writeOn(sketchPad, numberOfSteps);
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
        for (int i = 0; i < numberOfSteps; i++)
            assertEquals(1, sketchPad.getFloor()[0][i]);
        assertEquals(new Position(5,0), turtle.getCurrentPosition());

    }
    @Test
    void testThatTurtleCanWriteOnSketchPadWhenFacingSouth(){
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.movePenDown();
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        assertFalse(turtle.isPenUp());
        int numberOfSteps = 6;
        turtle.writeOn(sketchPad, numberOfSteps);
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
        for (int i = 0; i < numberOfSteps; i++)
            assertEquals(1, sketchPad.getFloor()[i][0]);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanWriteOnSketchPadWhenFacingNorth(){
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        assertTrue(turtle.isPenUp());
        int numberOfSteps = 6;
        turtle.writeOn(sketchPad, numberOfSteps);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());

        turtle.turnRight();
        turtle.turnRight();

        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.movePenDown();
        turtle.writeOn(sketchPad, numberOfSteps);
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
        for (int i = 0; i < numberOfSteps; i++)
            assertEquals(1, sketchPad.getFloor()[i][0]);
        assertEquals(new Position(0,0), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanWriteOnSketchPadWhenFacingWest(){
        SketchPad sketchPad = new SketchPad(20,20);
        assertTrue(turtle.isPenUp());
        int numberOfSteps = 6;
        turtle.writeOn(sketchPad, numberOfSteps);
        assertEquals(new Position(5,0), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());

        turtle.movePenDown();
        turtle.writeOn(sketchPad, numberOfSteps);

        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
        for (int i = 0; i < numberOfSteps; i++)
            assertEquals(1, sketchPad.getFloor()[0][i]);
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }
}
