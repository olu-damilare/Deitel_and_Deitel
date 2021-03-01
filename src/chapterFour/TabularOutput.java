package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        int number = 1;
        int numberTimesTen;
        int numberTimesHundred;
        int numberTimesOneThousand;

        System.out.println("N\t" + "10*N\t" + "100*N\t" + "1000*N" );
        while(number <= 5){
            numberTimesTen = number * 10;
            numberTimesHundred = numberTimesTen * 10;
            numberTimesOneThousand = numberTimesHundred * 10;
            System.out.println(number + "\t" + numberTimesTen + "\t\t" + numberTimesHundred + "\t\t" + numberTimesOneThousand);
                    number++;
        }
    }
}
