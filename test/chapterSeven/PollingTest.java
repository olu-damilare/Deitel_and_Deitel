package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollingTest {
    Polling polling;
    private Random random = new Random();

    @BeforeEach
    void setUp() {
        polling = new Polling();
        polling.setTopics();
    }
    @AfterEach
    void tearDown() {
        polling = null;
    }

    @Test
    void testThatPoliticalIssuesCanBeRated(){
        polling.ratePoliticalIssueTopic(5);
        assertEquals("00 00 00 00 01 00 00 00 00 00 ", polling.getResponsesOfPoliticalIssuesRatings());

    }
    @Test
    void testThatPoliticalIssuesCannotHaveARatingNotBetweenOneAndTen(){
        try {
            polling.ratePoliticalIssueTopic(11);
            polling.ratePoliticalIssueTopic(-5);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        };
        assertEquals("00 00 00 00 00 00 00 00 00 00 ", polling.getResponsesOfPoliticalIssuesRatings());

    }

    @Test
    void testThatGlobalEnvironmentalIssuesCanBeRated(){
        polling.rateGlobalEnvironmentalIssuesTopic(9);
        assertEquals("00 00 00 00 00 00 00 00 01 00 ", polling.getResponsesOfGlobalEnvironmentalIssuesRatings());

    }
    @Test
    void testThatGlobalEnvironmentalIssuesCannotHaveARatingNotBetweenOneAndTen(){
        try {
            polling.rateGlobalEnvironmentalIssuesTopic(12);
            polling.ratePoliticalIssueTopic(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        };
        assertEquals("00 00 00 00 00 00 00 00 00 00 ", polling.getResponsesOfGlobalEnvironmentalIssuesRatings());

    }
    @Test
    void testThatOverpopulationIssuesCanBeRated(){
        polling.rateOverpopulationIssuesTopic(3);
        assertEquals("00 00 01 00 00 00 00 00 00 00 ", polling.getResponsesOfOverpopulationIssuesRatings());

    }
    @Test
    void testThatOverpopulationIssuesCannotHaveARatingNotBetweenOneAndTen(){
        try {
            polling.rateOverpopulationIssuesTopic(12);
            polling.rateOverpopulationIssuesTopic(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        };
        assertEquals("00 00 00 00 00 00 00 00 00 00 ", polling.getResponsesOfOverpopulationIssuesRatings());

    }
    @Test
    void testThatGenderInequalityIssuesCanBeRated(){
        polling.rateGenderInequalityIssuesTopic(6);
        assertEquals("00 00 00 00 00 01 00 00 00 00 ", polling.getResponsesOfGenderInequalityIssuesRatings());

    }
    @Test
    void testThatGenderInequalityIssuesCannotHaveARatingNotBetweenOneAndTen(){
        try {
            polling.rateGenderInequalityIssuesTopic(12);
            polling.rateGenderInequalityIssuesTopic(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        };
        assertEquals("00 00 00 00 00 00 00 00 00 00 ", polling.getResponsesOfGenderInequalityIssuesRatings());

    }
    @Test
    void testThatRacismIssuesCanBeRated(){
        polling.rateRacismIssuesTopic(7);
        assertEquals("00 00 00 00 00 00 01 00 00 00 ", polling.getResponsesOfRacismIssuesRatings());

    }
    @Test
    void testThatRacismIssuesCannotHaveARatingNotBetweenOneAndTen(){
        try {
            polling.rateRacismIssuesTopic(12);
            polling.rateRacismIssuesTopic(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        };
        assertEquals("00 00 00 00 00 00 00 00 00 00 ", polling.getResponsesOfRacismIssuesRatings());

    }
    @Test
    void testThatResponsesOfAllTopicsAreDisplayed(){
                   polling.rateGlobalEnvironmentalIssuesTopic(8);
            polling.ratePoliticalIssueTopic(2);
            polling.rateRacismIssuesTopic(4);
            polling.rateOverpopulationIssuesTopic(5);
            polling.rateGenderInequalityIssuesTopic(6);


        assertEquals("""
                        Political Issues:      00 01 00 00 00 00 00 00 00 00\s
                        Global Environment:    00 00 00 00 00 00 00 01 00 00\s
                        Overpopulation issues: 00 00 00 00 01 00 00 00 00 00\s
                        Gender Inequality:     00 00 00 00 00 01 00 00 00 00\s
                        Racism Issues:         00 00 00 01 00 00 00 00 00 00\s
                        """
                , polling.displayResponses());
    }

    @Test
    void testThatAverageOfPoliticalIssuesResponsesObtained(){
        polling.ratePoliticalIssueTopic(2);
        polling.ratePoliticalIssueTopic(6);
        polling.ratePoliticalIssueTopic(2);
        polling.ratePoliticalIssueTopic(8);
        polling.ratePoliticalIssueTopic(5);
        polling.ratePoliticalIssueTopic(2);
        polling.ratePoliticalIssueTopic(6);
        polling.ratePoliticalIssueTopic(2);
        polling.ratePoliticalIssueTopic(8);
        polling.ratePoliticalIssueTopic(5);
        polling.ratePoliticalIssueTopic(2);
        polling.ratePoliticalIssueTopic(6);
        polling.ratePoliticalIssueTopic(2);
        polling.ratePoliticalIssueTopic(8);
        polling.ratePoliticalIssueTopic(5);

        assertEquals(1.5, polling.getAverageRatingForPoliticalIssues());
    }
    @Test
    void testThatAverageOfGlobalEnvironmentalIssuesResponsesObtained(){
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(6);
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(8);
        polling.rateGlobalEnvironmentalIssuesTopic(5);
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(6);
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(8);
        polling.rateGlobalEnvironmentalIssuesTopic(5);
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(6);
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(8);
        polling.rateGlobalEnvironmentalIssuesTopic(5);
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(6);
        polling.rateGlobalEnvironmentalIssuesTopic(2);
        polling.rateGlobalEnvironmentalIssuesTopic(8);
        polling.rateGlobalEnvironmentalIssuesTopic(5);

        assertEquals(2.0, polling.getAverageRatingForGlobalEnvironmentalIssues());
    }
    @Test
    void testThatAverageOfOverpopulationIssuesResponsesObtained(){
        polling.rateOverpopulationIssuesTopic(2);
        polling.rateOverpopulationIssuesTopic(6);
        polling.rateOverpopulationIssuesTopic(2);
        polling.rateOverpopulationIssuesTopic(8);
        polling.rateOverpopulationIssuesTopic(5);
        polling.rateOverpopulationIssuesTopic(2);
        polling.rateOverpopulationIssuesTopic(6);
        polling.rateOverpopulationIssuesTopic(2);
        polling.rateOverpopulationIssuesTopic(8);
        polling.rateOverpopulationIssuesTopic(5);
        polling.rateOverpopulationIssuesTopic(2);
        polling.rateOverpopulationIssuesTopic(6);
        polling.rateOverpopulationIssuesTopic(2);
        polling.rateOverpopulationIssuesTopic(8);
        polling.rateOverpopulationIssuesTopic(5);


        assertEquals(1.5, polling.getAverageRatingForOverpopulationIssues());
    }
    @Test
    void testThatAverageOfGenderInequalityIssuesResponsesObtained(){
        polling.rateGenderInequalityIssuesTopic(2);
        polling.rateGenderInequalityIssuesTopic(8);
        polling.rateGenderInequalityIssuesTopic(4);
        polling.rateGenderInequalityIssuesTopic(7);
        polling.rateGenderInequalityIssuesTopic(9);
        polling.rateGenderInequalityIssuesTopic(10);
        polling.rateGenderInequalityIssuesTopic(2);
        polling.rateGenderInequalityIssuesTopic(8);
        polling.rateGenderInequalityIssuesTopic(4);
        polling.rateGenderInequalityIssuesTopic(7);
        polling.rateGenderInequalityIssuesTopic(9);
        polling.rateGenderInequalityIssuesTopic(10);
        polling.rateGenderInequalityIssuesTopic(2);
        polling.rateGenderInequalityIssuesTopic(8);
        polling.rateGenderInequalityIssuesTopic(4);
        polling.rateGenderInequalityIssuesTopic(7);
        polling.rateGenderInequalityIssuesTopic(9);
        polling.rateGenderInequalityIssuesTopic(10);


        assertEquals(1.8, polling.getAverageRatingForGenderInequalityIssues());
    }

    @Test
    void testThatAverageOfRacismIssuesResponsesObtained(){
        polling.rateRacismIssuesTopic(2);
        polling.rateRacismIssuesTopic(5);
        polling.rateRacismIssuesTopic(1);
        polling.rateRacismIssuesTopic(10);
        polling.rateRacismIssuesTopic(8);
        polling.rateRacismIssuesTopic(2);
        polling.rateRacismIssuesTopic(5);
        polling.rateRacismIssuesTopic(1);
        polling.rateRacismIssuesTopic(10);
        polling.rateRacismIssuesTopic(8);


        assertEquals(1.0, polling.getAverageRatingForRacismIssues());
    }


}
