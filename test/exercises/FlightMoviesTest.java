package tddClasses;

import Exercise.FlightMovies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightMoviesTest {

    @Test
    void testThatSumOfLengthOfTwoMoviesEqualsFlightLength(){
        int[] moviesLength = {150,220, 150,230,115};
        int flightLength = 450;
     assertTrue(FlightMovies.moviesLengthSumEqualsFlightLength(flightLength, moviesLength));
    }
}
