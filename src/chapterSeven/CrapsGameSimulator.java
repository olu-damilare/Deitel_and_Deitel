package Exercise;

public class CrapsGameSimulator {
    static int[] gameWonCounters = new int[20];
    static int[] gameLostCounters = new int[20];

    public static void main(String[] args) {
        int numberOfGamePlays = 1_000_000;
        CrapsGameSimulator simulator = new CrapsGameSimulator();

        for (int i = 0; i < numberOfGamePlays; i++) {
            simulator.playOneCrapsGame();
        }

        int sumOfWins = 0;
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d%15d%n",gameWonCounters[i], gameLostCounters[i]);
            sumOfWins += gameWonCounters[i];
        }
        System.out.printf("%s%.2f", "The probability of winning a craps game is", simulator.calculateChancesOfWinning(sumOfWins,numberOfGamePlays));

    }

    public void playOneCrapsGame() {
        Craps game = new Craps();
        int gameResultCounter = 0;

        do {
            game.play();
            ++gameResultCounter;
        } while (game.getGameStatus() == CrapStatus.CONTINUE);

        if(gameResultCounter > 20)
            gameResultCounter = 20;
        if(game.getGameStatus() == CrapStatus.WON) {
            gameWonCounters[gameResultCounter - 1] += 1;
        } else if(game.getGameStatus() == CrapStatus.LOST)
            gameLostCounters[gameResultCounter - 1] += 1;
    }

    public double calculateChancesOfWinning(int numerator, int denominator){
        return (numerator * 1.0) / denominator;
    }


}
