import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateSequentialFile {
    
    private static ObjectOutputStream output;

    public static void main(String[] args) {
        openFile();
        WriteFile();
        closeFile();
        
    }

    public static void openFile() {
        
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("accounts.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void WriteFile() {
        try {
            output.writeObject(new Account(1, "sa", "asdas", 0));
            output.writeObject(new Account(2, "sa", "asdas", 0));
            output.writeObject(new Account(3, "sa", "asdas", 0));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeFile() {
        try {
            output.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
