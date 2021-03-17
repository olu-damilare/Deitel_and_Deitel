package chapterSix;

public class DistanceBetweenPoints {

    private static double xCoordinateOfPointA;
    private static double yCoordinateOfPointA;
    private static double xCoordinateOfPointB;
    private static double yCoordinateOfPointB;
    private static double horizontalDistance;
    private static double verticalDistance;

    public static void setCoordinatesOfPointA(double xCoordinate, double yCoordinate) {
        xCoordinateOfPointA = xCoordinate;
        yCoordinateOfPointA = yCoordinate;
        
    }

    public static double getXCoordinateOfPointA() {
        return xCoordinateOfPointA;
    }

    public static double getYCoordinateOfPointA() {
        return yCoordinateOfPointA;
    }

    public static void setCoordinatesOfPointB(double xCoordinate, double yCoordinate) {
        xCoordinateOfPointB = xCoordinate;
        yCoordinateOfPointB = yCoordinate;
    }

    public static double getXCoordinateOfPointB() {
        return xCoordinateOfPointB;
    }

    public static double getYCoordinateOfPointB() {
        return yCoordinateOfPointB;
    }

    public static void calculateHorizontalDistance() {
        double rootOfHorizontalDistance = xCoordinateOfPointA - xCoordinateOfPointB;

        horizontalDistance = rootOfHorizontalDistance * rootOfHorizontalDistance;

    }
    public static double getHorizontalDistance() {
        return horizontalDistance;
    }

    public static void calculateVerticalDistance() {
        double rootOfVerticalDistance = yCoordinateOfPointA - yCoordinateOfPointB;

        verticalDistance = rootOfVerticalDistance * rootOfVerticalDistance;

    }
    public static double getVerticalDistance() {
        return verticalDistance;
    }

    public static double calculateDistance() {
        calculateVerticalDistance();
        calculateHorizontalDistance();
        return Math.sqrt(verticalDistance + horizontalDistance);

    }



}
