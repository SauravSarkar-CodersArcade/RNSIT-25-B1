package rns.fileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file =
                new File("./Files/Demo/Java/rns.txt");
        // System.getProperty("user.dir" + "/");
        if(file.createNewFile()){
            System.out.println("File " + file.getName() + " created.");
        }else {
            System.out.println("Failed to create the file.");
        }
    }
}
