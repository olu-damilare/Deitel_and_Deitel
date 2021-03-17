package tddClasses;

public class FlightMovies {
    public static boolean moviesLengthSumEqualsFlightLength(int flightLength, int[] moviesLength) {
        boolean isEqual = false;
        int firstMovie;
        int secondMovie;
        for (int i = 0; i < moviesLength.length; i++) {
            firstMovie = moviesLength[i];

                 for (int j = i+1; j < moviesLength.length; j++) {
                     secondMovie = moviesLength[j];
                     if (firstMovie + secondMovie == flightLength) {
                        isEqual = true;
                        break;
                     }
            }
        }

        return isEqual;

    }
}
