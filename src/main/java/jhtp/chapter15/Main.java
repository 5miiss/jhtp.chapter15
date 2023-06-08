package jhtp.chapter15;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("newmast.txt");
        System.out.println(Files.exists(path));
        boolean loop = true;
        try (Scanner input = new Scanner(Files.newInputStream(path));
            ObjectInputStream objectinputStream = new ObjectInputStream(Files.newInputStream(Paths.get("newMastObj.txt")))) {
            if(input.hasNextLine())
            {
                System.out.println("in if");

                Account account = new Account();
                account.setAccount(input.nextInt());
                account.setFirstName(input.next());
                account.setLastName(input.next());
                account.setBalance(input.nextDouble());
                System.out.println(account);
            }
            System.out.println("after if");

            while(loop){
                System.out.println((Account)objectinputStream.readObject() );
            }
            
            
        }
        catch (EOFException e) {
            loop = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
