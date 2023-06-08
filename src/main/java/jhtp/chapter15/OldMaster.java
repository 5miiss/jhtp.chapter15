package jhtp.chapter15;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class OldMaster {
    public static void main(String[] args) {
        //for character based streams
        try (OutputStream outputStream = Files.newOutputStream(Paths.get("newmast.txt"));
        OutputStream outputStream1 = Files.newOutputStream(Paths.get("newMastObj.txt"));
         Formatter formatter = new Formatter(outputStream);
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream1)) {
            formatter.format("595 Abdullah Khames 2132.2\n");
            formatter.format("595 Abdullah Khames 2132.2\n");

            objectOutputStream.writeObject(new Account(1,"mohamed","ka3oud",123136.123));
            objectOutputStream.writeObject(new Account(2,"mohamed","3esawy",123136.123));
            objectOutputStream.writeObject(new Account(3,"abdullah","khames",123136.123));
            objectOutputStream.writeObject(new Account(3,"abdullah","khames",123136.123));
            objectOutputStream.writeObject(new Account(3,"abdullah","khames",123136.123));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
