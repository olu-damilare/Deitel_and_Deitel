package chapterFive;

public class FacebookUserBaseGrowth {
    public static void main(String[] args) {
        int users = 1_000_000_000;
        double growthRate = 0.04;
        int month = 1;
        double newUsers = 0;
        boolean firstTargetFound = false;
        int firstTarget = 0;
        int secondTarget = 0;


        while (true) {
            newUsers = users * Math.pow((1.0 + growthRate), month);
            if (newUsers >= 1_500_000_000 && !firstTargetFound) {
                firstTarget = month;
                firstTargetFound = true;
            }
            if (newUsers >= 2_000_000_000) {
                secondTarget = month;
               break;
            }

            month++;
        }

        System.out.println("Facebook reached 1.5 billion users after " + firstTarget + " months");

        System.out.println("Facebook reached 2 billion users after " + secondTarget + " months");
        }
    }

