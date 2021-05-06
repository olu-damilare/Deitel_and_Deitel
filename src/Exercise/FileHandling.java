package Exercise;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("app.java");
            System.out.println(file.exists());
            
            if(!file.exists()) {
                PrintWriter output = new PrintWriter(file);
                output.print("Hello");
                output.println(4);
               // System.out.println(file.exists());
                output.close();
            }

            try(
                PrintWriter output = new PrintWriter(file);
            ){
                output.print("Hello");
                output.println(4);
               // System.out.println(file.exists());
            }
        //System.out.println(file.exists());
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String first = scanner.next();
                int second = scanner.nextInt();
                String third = scanner.next();
                int fourth = scanner.nextInt();
                System.out.printf("%s%n%d%s%n%d", first, second, third, fourth);
            }

    }
}
