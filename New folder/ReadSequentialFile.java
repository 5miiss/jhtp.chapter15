import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {
    private static ObjectInputStream objectInputStream;

    public static void main(String[] args) {
        openFile();
        readFile();
        closeFile();
    }

    private static void closeFile() {
        try {
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void readFile() {
        try {
            Account account = (Account) objectInputStream.readObject();
            System.out.println(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void openFile() {
        try {
            objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("accounts.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
