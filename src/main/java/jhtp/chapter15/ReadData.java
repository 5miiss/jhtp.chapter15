package jhtp.chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class ReadData {
    private static Scanner scanner;

    public static void openFile(){
        try{
            scanner = new Scanner(Paths.get("demo.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readFile(){
        try {
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void closeFile(){
        scanner.close();
    }
}
