package jhtp.chapter15;

import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {
    private static Formatter output;

    
    public static void openFile(){

        try {
            output = new Formatter("test.txt");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

    public static void addRecords(){
        System.out.printf("%s%n%s%n? ","enter account number and first name and last name and balance","enter end of file indicator");
        try (Scanner input = new Scanner(System.in)) {
            while(input.hasNext()){
                try {
                    output.format("%d %s %s %.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
                        output.flush();
                } catch (Exception e) {
                    System.err.println("Error writing to file. Terminating.");
                    e.printStackTrace();
                }
                System.out.print("? ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void closeFile(){
        if (output != null) {
            output.close();
        }
    }
}
