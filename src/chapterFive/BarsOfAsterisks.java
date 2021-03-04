package chapterFive;

public class BarsOfAsterisks {
    private String asterisks;

    public String printBarsOfAsterisks(int barLength) {
        if(barLength >= 1)
        {
            asterisks = "*";
            if (barLength >=1 )
            {
                for (int i = 0; i < (barLength - 1); i++) {
                    asterisks += "*";
                }
            }
        }
        return asterisks;
    }

}
