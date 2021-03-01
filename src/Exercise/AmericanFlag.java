package Exercise;

public class AmericanFlag {
    public void buildCheckerBoard(int size) {
        int asteriskLimit = 0;
        String row = "";
        String column ="";
        String assignment = "";

        while(asteriskLimit < size){
            row += " *";
            column += " *";
            asteriskLimit++;
        }

        asteriskLimit = 0;

        while(asteriskLimit < (size * 2)){
            assignment += " =";
            asteriskLimit++;
        }

        asteriskLimit = 0;

        while(asteriskLimit < ((size / 2))){
            System.out.print(row);
            System.out.println(assignment);
            System.out.print(column);
            System.out.println(assignment);
            asteriskLimit++;
        }
        asteriskLimit = 0;
        while(asteriskLimit < size ){
            assignment += " =";
            asteriskLimit++;
        }
        asteriskLimit = 0;
        while(asteriskLimit < ((size))){
            System.out.println(assignment);
            asteriskLimit++;
        }


    }
}
