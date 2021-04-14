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
        int racismPollRate;
        int overpopulationPollRate;
        int politicalIssuesPollRate;
        int globalEnvironPollRate;
        int genderInequalityRatePoll;


        for (int i = 0; i < 100; i++) {
            racismPollRate = 1 + random.nextInt(10);
            overpopulationPollRate = 1 + random.nextInt(10);
            politicalIssuesPollRate = 1 + random.nextInt(10);
            globalEnvironPollRate = 1 + random.nextInt(10);
            genderInequalityRatePoll = 1 + random.nextInt(10);

            polling.rateGlobalEnvironmentalIssuesTopic(globalEnvironPollRate);
            polling.ratePoliticalIssueTopic(politicalIssuesPollRate);
            polling.rateRacismIssuesTopic(racismPollRate);
            polling.rateOverpopulationIssuesTopic(overpopulationPollRate);
            polling.rateGenderInequalityIssuesTopic(genderInequalityRatePoll);
        }

        assertEquals("""
                Political Issues:      11 08 04 08 11 12 11 12 10 13\s
                Global Environment:    11 13 09 11 09 06 07 08 13 13\s
                Overpopulation issues: 12 13 08 09 08 09 09 10 12 10\s
                Gender Inequality:     09 14 06 06 10 09 18 13 06 09\s
                Racism Issues:         09 06 07 09 10 14 07 11 15 12\s""", polling.displayResponses());
    }
}
