package turtleGraphics;

import java.util.Objects;

public class Position {
    private int X_coordinate;
    private int Y_coordinate;

    public Position(int coordinate_of_X, int coordinate_of_Y) {
        X_coordinate = coordinate_of_X;
        Y_coordinate = coordinate_of_Y;
    }

    @Override
    public String toString() {
        return "Position: \n" +
                "X_coordinate = " + X_coordinate + '\n' +
                "Y_coordinate = " + Y_coordinate + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return X_coordinate == position.X_coordinate && Y_coordinate == position.Y_coordinate;
    }


    public void increaseValueOfXCoordinateBy(int numberOfSteps) {
        X_coordinate += numberOfSteps;
    }

    public void increaseValueOfYCoordinateBy(int numberOfSteps) {
        Y_coordinate += numberOfSteps;
    }

    public void decreaseValueOfXCoordinateBy(int numberOfSteps) {
        X_coordinate -= numberOfSteps;
    }

    public void decreaseValueOfYCoordinateBy(int numberOfSteps) {
        Y_coordinate -= numberOfSteps;
    }

    public int getCoordinateOfY() {
        return Y_coordinate;
    }

    public int getCoordinateOfX() {
        return X_coordinate;
    }
}
