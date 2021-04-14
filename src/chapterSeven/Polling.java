package chapterSeven;

public class Polling {
    private final String[] topics = new String[5];
    private final int[][] responses = new int[5][10];


    private void validateRating(int rating) {
        boolean invalidRating = rating < 1 || rating > 10;
        if(invalidRating)
            throw new IllegalArgumentException("Rating should be between 1 and 10");
    }

    public String getResponsesOfPoliticalIssuesRatings() {
        StringBuilder ratings = new StringBuilder();
        for (int i = 0; i < responses[0].length; i++) {
            String formattedResponse = String.format("%02d", responses[0][i]);
            ratings.append(formattedResponse).append(" ");
        }
        return ratings.toString();
    }

    public void ratePoliticalIssueTopic(int rating) {
        validateRating(rating);
        ++responses[0][rating - 1];
    }

    public void rateGlobalEnvironmentalIssuesTopic(int rating) {
        validateRating(rating);
        ++responses[1][rating - 1];
    }

    public String getResponsesOfGlobalEnvironmentalIssuesRatings() {
        StringBuilder ratings = new StringBuilder();
        for (int i = 0; i < responses[1].length; i++) {
            String formattedResponse = String.format("%02d", responses[1][i]);
            ratings.append(formattedResponse).append(" ");
        }
        return ratings.toString();
    }

    public void rateOverpopulationIssuesTopic(int rating) {
        validateRating(rating);
        ++responses[2][rating - 1];
    }

    public String getResponsesOfOverpopulationIssuesRatings() {
        StringBuilder ratings = new StringBuilder();
        for (int i = 0; i < responses[2].length; i++) {
            String formattedResponse = String.format("%02d", responses[2][i]);
            ratings.append(formattedResponse).append(" ");
        }
        return ratings.toString();
    }

    public void rateGenderInequalityIssuesTopic(int rating) {
        validateRating(rating);
        ++responses[3][rating - 1];
    }

    public String getResponsesOfGenderInequalityIssuesRatings() {
        StringBuilder ratings = new StringBuilder();
        for (int i = 0; i < responses[3].length; i++) {
            String formattedResponse = String.format("%02d", responses[3][i]);
            ratings.append(formattedResponse).append(" ");
        }
        return ratings.toString();
    }

    public void rateRacismIssuesTopic(int rating) {
        validateRating(rating);
        ++responses[4][rating - 1];
    }

    public String getResponsesOfRacismIssuesRatings() {
        StringBuilder ratings = new StringBuilder();
        for (int i = 0; i < responses[4].length; i++) {
            String formattedResponse = String.format("%02d", responses[4][i]);
            ratings.append(formattedResponse).append(" ");
        }
        return ratings.toString();
    }

    public String displayResponses() {
        String responses = "";
        for (int i = 0; i < topics.length; i++) {
            responses += topics[i];
                switch (i) {
                    case 0 -> responses += getResponsesOfPoliticalIssuesRatings();
                    case 1 -> responses += getResponsesOfGlobalEnvironmentalIssuesRatings();
                    case 2 -> responses += getResponsesOfOverpopulationIssuesRatings();
                    case 3 -> responses += getResponsesOfGenderInequalityIssuesRatings();
                    case 4 -> responses += getResponsesOfRacismIssuesRatings();
                }
                responses += "\n";

            }
        return responses;
        }


    public void setTopics(){
        topics[0] = "Political Issues:      ";
        topics[1] = "Global Environment:    ";
        topics[2] = "Overpopulation issues: ";
        topics[3] = "Gender Inequality:     ";
        topics[4] = "Racism Issues:         ";
    }

    public double getAverageRatingForPoliticalIssues() {
        double total = 0.0;
        for (int i = 0; i < responses[0].length; i++) {
            total += responses[0][i];
        }
        return total/responses[0].length;
    }

    public double getAverageRatingForGlobalEnvironmentalIssues() {
        double total = 0.0;
        for (int i = 0; i < responses[1].length; i++) {
            total += responses[1][i];
        }
        return total/responses[1].length;
    }

    public double getAverageRatingForOverpopulationIssues() {
        double total = 0.0;
        for (int i = 0; i < responses[2].length; i++) {
            total += responses[2][i];
        }
        return total/responses[2].length;
    }

    public double getAverageRatingForGenderInequalityIssues() {
        double total = 0.0;
        for (int i = 0; i < responses[3].length; i++) {
            total += responses[3][i];
        }
        return total/responses[3].length;
    }

    public double getAverageRatingForRacismIssues() {
        double total = 0.0;
        for (int i = 0; i < responses[4].length; i++) {
            total += responses[4][i];
        }
        return total/responses[4].length;
    }
}
