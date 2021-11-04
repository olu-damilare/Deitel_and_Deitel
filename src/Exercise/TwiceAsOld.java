package Exercise;

public class TwiceAsOld {

           public static int twiceAsOld(int dadYears, int sonYears){
            if(sonYears < 1) return dadYears;
            int numberOfYears = 0;
            if((dadYears / 2) < sonYears){
                while(dadYears / sonYears != 2){
                    dadYears--;
                    sonYears--;
                    numberOfYears++;
                }
            }else if((dadYears / 2) > sonYears){
                while(dadYears % sonYears != 0){
                    dadYears++;
                    sonYears++;
                    numberOfYears++;
                }
            }else if(dadYears / sonYears == 2 && dadYears % sonYears == 0) return dadYears /sonYears;
            return numberOfYears;

        }

    public static void main(String[] args) {
        System.out.println(TwiceAsOld.twiceAsOld(30, 7));
    }

}
