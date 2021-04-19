package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        currentDirection = EAST;
        currentPosition = new Position(0, 0);
    }

    public Pen getPen() {
        return pen;
    }

    public void movePenDown() {
        pen.movePen(false);
    }


    public void movePenUp() {
        pen.movePen(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = WEST;
            case WEST -> currentDirection = NORTH;
            case NORTH -> currentDirection = EAST;
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> currentDirection = NORTH;
            case SOUTH -> currentDirection = EAST;
            case WEST -> currentDirection = SOUTH;
            case NORTH -> currentDirection = WEST;
        }
    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps -= 1;
        switch(currentDirection){
            case EAST -> currentPosition.increaseValueOfXCoordinateBy(numberOfSteps);
            case SOUTH -> currentPosition.increaseValueOfYCoordinateBy(numberOfSteps);
            case WEST -> currentPosition.decreaseValueOfXCoordinateBy(numberOfSteps);
            case NORTH -> currentPosition.decreaseValueOfYCoordinateBy(numberOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        int[][] floor = sketchPad.getFloor();
        switch (currentDirection) {
            case EAST -> {
                if (!pen.isUp())
                    for (int i = 0; i < numberOfSteps; i++)
                        floor[currentPosition.getCoordinateOfY()][currentPosition.getCoordinateOfX() + i] = 1;
                moveForwardBy(numberOfSteps);
            }
            case WEST -> {
                if (!pen.isUp())
                    for (int i = 0; i < numberOfSteps; i++)
                        floor[currentPosition.getCoordinateOfY()][currentPosition.getCoordinateOfX() - i] = 1;
                moveForwardBy(numberOfSteps);
            }
            case SOUTH -> {
                if (!pen.isUp())
                    for (int i = 0; i < numberOfSteps; i++)
                        floor[currentPosition.getCoordinateOfY() + i][currentPosition.getCoordinateOfX()] = 1;
                moveForwardBy(numberOfSteps);
            }
            case NORTH -> {
                if (!pen.isUp())
                    for (int i = 0; i < numberOfSteps; i++)
                        floor[currentPosition.getCoordinateOfY() - i][currentPosition.getCoordinateOfX()] = 1;
                moveForwardBy(numberOfSteps);
            }
        }
    }
}
