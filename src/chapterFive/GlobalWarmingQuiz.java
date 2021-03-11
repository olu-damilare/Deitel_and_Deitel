package chapterFive;

public class GlobalWarmingQuiz {
    private int totalScore = 0;

    public void selectAnswer(String userSelection) {
        if(userSelection.equals("A") || userSelection.equals("B") || userSelection.equals("C") || userSelection.equals("D"))
        ++totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
