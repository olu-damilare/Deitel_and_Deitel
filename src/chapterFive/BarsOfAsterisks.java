package chapterFive;

public class BarsOfAsterisks {
    private String asterisks;

    public String printBarsOfAsterisks(int barLength) {
        if(barLength >= 1 && barLength <= 30)
        {
            asterisks = "*";
            if (barLength >= 30)
            {
                for (int i = 0; i < (barLength - 1); i++) {
                    asterisks += "*";
                }
            }
        }
        else
            return "Invalid number";
        return asterisks;
    }

}
