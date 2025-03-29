package rns.fileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("./Files/Demo/Java/rns.txt");
        Scanner reader = new Scanner(obj);
        while (reader.hasNext()){
            // Any data in the text files is String
            String str = reader.nextLine();
            System.out.println(str);
        }
        reader.close();
    }
}
