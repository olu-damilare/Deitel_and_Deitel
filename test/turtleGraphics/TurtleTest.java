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
        turtle.moveForwardBy(10);
        assertEquals(new Position(10,0), turtle.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveForwardWhenFacingSouth(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(10);
        assertEquals(new Position(0,10), turtle.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveForwardWhenFacingWest(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(10);
        assertEquals(new Position(10,0), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveForwardBy(6);
        assertEquals(new Position(4,0), turtle.getCurrentPosition());
    }
    @Test
    void testThatTurtleCanMoveForwardWhenFacingNorth(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(6);
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.moveForwardBy(3);
        assertEquals(new Position(0,3), turtle.getCurrentPosition());
    }
    @Test
    void testThatTurtleCanDrawOnABoard(){
        Board board = new Board(20,20);
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
        turtle.moveForwardBy(6);
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
        assertEquals("******", turtle.displayBoard());
    }
}
