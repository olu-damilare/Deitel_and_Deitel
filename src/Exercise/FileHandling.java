package Exercise;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file directory");
        String directory = scanner.nextLine();
        Path path = Paths.get(directory);

        if(Files.exists(path)){
            System.out.println(path.getFileName() + " exists");
            if(Files.isDirectory(path)){
                System.out.println(path + " is a directory");
            }
            else{
                System.out.println(path + " is not a directory");
            }
            System.out.println("last modified: "+ Files.getLastModifiedTime(path));
            System.out.println("Path: "+ path);
            System.out.println("Absolute path: "+ path.toAbsolutePath());

            if(Files.isDirectory(path)){
                System.out.println("Directory contents: ");
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for(Path p: directoryStream)
                    System.out.println(p);
            }
        }
        else{
            System.out.println(path + " does not exist");
        }



    }
}
