package jhtp.chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static jhtp.chapter15.ReadData.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("enter path");
        // Path path  = Paths.get(scanner.nextLine());

        // if(Files.exists(path)){
        //     System.out.println("is absolute "+path.isAbsolute());
        //     System.out.println("file name "+path.getFileName());
        //     System.out.println("is directory "+Files.isDirectory(path));
        //     try {
        //         System.out.println("file size "+Files.size(path));
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }

        //     if(Files.isDirectory(path)){
        //         try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
        //             directoryStream.forEach(x->System.out.println("directory contents "+x));
        //         } catch (IOException e) {
        //             // TODO Auto-generated catch block
        //             e.printStackTrace();
        //         }
        //     }

        // }
        // else
        // System.out.println("file not exist");
        // scanner.close();

        // CreateTextFile.openFile();
        // CreateTextFile.addRecords();
        // CreateTextFile.closeFile();

            openFile();
            readFile();
            closeFile();
    }
}
