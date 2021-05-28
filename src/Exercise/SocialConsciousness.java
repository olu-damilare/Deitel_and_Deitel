package Exercise;

import java.security.SecureRandom;

public class SocialConsciousness {
    private String[] topics = {"Bullying", "Depression", "Drug abuse", "Peer pressure", "Obesity"};
    private int[][] ratings = new int[5][10];

    public void rateBullying(int userRating) {
        int indexToIncrement = userRating - 1;
        ++ratings[0][indexToIncrement];
    }
    public void rateDepression(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[1][indexToIncrement];
    }
    public void rateDrugAbuse(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[2][indexToIncrement];
    }
    public void ratePeerPressure(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[3][indexToIncrement];
    }
    public void rateObesity(int userRating){
        int indexToIncrement = userRating - 1;
        ++ratings[4][indexToIncrement];
    }
    public void displayRatingsFrequency(){
        for (int i = 0; i < topics.length; i++) {
            System.out.print(topics[i] + "\t");
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.print(ratings[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public void getDepressionMaxRating(){
        int maxFrequency = ratings[0][0];
        int maxRating = 1;

        for (int i = 1; i < ratings[0].length; i++) {

            if (maxFrequency < ratings[0][i]) {
                maxFrequency = ratings[0][i];
                maxRating = i + 1;
            }

        }
        System.out.println("the highest rating " + maxRating);
    }

    public int getAverage(){
        int numerator = 0;
        int denominator = 0;
        for (int i = 0; i < ratings[0].length; i++) {
            numerator += ratings[0][i] * (i + 1);
            denominator += ratings[0][i];
        }
        int average = numerator / denominator;
        return average;
    }

    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        SocialConsciousness social  = new SocialConsciousness();
        SecureRandom randomizer = new SecureRandom();

        for (int i = 0; i < 1000; i++) {


            // System.out.println("Rate for Bullying");
             int userRating = 1 + randomizer.nextInt(10);
            social.rateBullying(userRating);

            // System.out.println("Rate for Depression");
            //userRating = scanner.nextInt();
            userRating = 1 + randomizer.nextInt(10);
            social.rateDepression(userRating);

            // System.out.println("Rate for Drug Abuse");
            // userRating = scanner.nextInt();
            userRating = 1 + randomizer.nextInt(10);
            social.rateDrugAbuse(userRating);

            //  System.out.println("Rate for Peer pressure");
            // userRating = scanner.nextInt();
            userRating = 1 + randomizer.nextInt(10);
            social.ratePeerPressure(userRating);

            //System.out.println("Rate for Obesity");
            //userRating = scanner.nextInt();
            userRating = 1 + randomizer.nextInt(10);
            social.rateObesity(userRating);

        }
        social.displayRatingsFrequency();
        social.getDepressionMaxRating();
        System.out.println("The average rating is " + social.getAverage());



    }



}
