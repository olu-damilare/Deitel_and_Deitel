package turtleGraphics;

public class Board {
    int[][] board;
    public Board(int length, int breadth) {
        board = new int[length][breadth];
    }

    public void drawEastWard(int numberOfSteps) {

    }

    public String displayBoard() {
        String pattern = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1)
                    pattern += "*";
            }
        }
        return pattern;
    }
}
