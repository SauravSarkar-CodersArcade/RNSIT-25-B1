package rns.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new
                FileWriter("./Files/Demo/Java/rns.txt", true);
        writer.append("\nGood Afternoon");
        writer.close();
        System.out.println("Wrote data into the file.");
    }
}
