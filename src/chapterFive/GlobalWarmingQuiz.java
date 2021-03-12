package chapterFive;

public class GlobalWarmingQuiz {
    private int totalScore = 0;

    public void selectAnswer(String userSelection) {
        userSelection = userSelection.toUpperCase();
        boolean validSelection = userSelection.equals("A") || userSelection.equals("B") || userSelection.equals("C") || userSelection.equals("D");
        if(validSelection)
        ++totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String questionOne() {
        String questionOne = """
                Question 1:
                                    
                Which of the following does not trap heat?
                A. Carbon dioxide
                B. Nitrogen
                C. Water vapor
                D. Methane
                """;
        return questionOne;
    }


    public String questionTwo(){
        String questionTwo = """
                Question 2:
                How do scientists collect evidence about climate?
                                    
                A. Using remote sensing from space with satellites
                B. By ground-based measurements of surface temperature,
                   carbon dioxide concentration and sea level.
                C. By collecting "proxy data" from tree rings, ice cores and historical records.
                D. All of the above.
                """;
        return questionTwo;
    }

    public String questionThree(){
        String questionThree = """
                Question 3:
                What is the coldest part of an ice sheet?
                A. The Base
                B. The middle
                C. The surface
                D. It's roughly the same temperature throughout.
                """;

        return questionThree;
    }

    public String questionFour(){
        String questionFour = """
                Question 4:
                
                Plants use carbon dioxide and water to make their own food 
                through the process of photosynthesis. When they are doing a lot of
                photosynthesis, plants reflect light strongly in 
                which of the following wavelengths?
                
                A. Visible
                B. Ultra-violet
                C. Near-infrared
                D. All of the above.
                """;
        return questionFour;

    }

    public String questionFive(){
        String questionFive = """
                Question 5:
                Which one of these decreases the level of carbon dioxide in our atmosphere?
                
                A. Driving non-electric cars
                B. Planting trees.
                C. Cutting down trees
                D. Travelling in planes.
                """;
        return questionFive;
    }


    public String result() {
        if(totalScore == 5)
            return "Excellent";
        else if(totalScore == 4)
            return "Very good";
        else
            return """
                    Time to brush up your knowledge of global warming.
                    for more information on climate change, lookup:
                    www.climate.nasa.gov, 
                    www.environmentalsciencedegree.com/climate-change/,
                    www.greenfacts.org/en/climate-change-ar3/ 
                    """;
    }
}
