package jhtp.chapter15;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test {
    
    public static void main(String[] args) {
        URI uri;
        try {
            Path path = Paths.get("D:" +File.separator+"demos" +File.separator+"JHTP");
            System.out.println(Files.exists(path));
            System.out.println( Files.isDirectory(path));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            for (Path path2 : directoryStream) {
                System.out.println( path2.getFileName());
            }
        
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
