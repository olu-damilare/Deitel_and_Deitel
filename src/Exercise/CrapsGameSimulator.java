package Exercise;

public class CrapsGameSimulator {
    static int[] gameWonCounters = new int[20];
    static int[] gameLostCounters = new int[20];
    public static void main(String[] args) {
        CrapsGameSimulator simulator = new CrapsGameSimulator();
        for (int i = 0; i < 1_000_000; i++) {
            simulator.playOneCrapsGame();
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d%15d%n",gameWonCounters[i], gameLostCounters[i]);
        }

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

//        System.out.println("The game played " + gameResultCounter + " times and status is " + game.getGameStatus());
//
//        System.out.println(gameWonCounters[gameResultCounter - 1]);
//        System.out.println(gameLostCounters[gameResultCounter - 1]);


    }
}
