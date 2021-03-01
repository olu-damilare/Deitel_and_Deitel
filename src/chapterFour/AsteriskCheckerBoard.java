package chapterFour;

public class AsteriskCheckerBoard {
    public void buildCheckerBoard(int size) {
        int asteriskLimit = 0;
        String row = "";
        String column ="";
        while(asteriskLimit < size){
            row += "* ";
            column += " *";
            asteriskLimit++;
        }
        System.out.println(row);
        System.out.println(column);
        asteriskLimit = 0;
        while(asteriskLimit < ((size / 2) - 1)){
            System.out.println(row);
            System.out.println(column);
            asteriskLimit++;
        }

    }
}
