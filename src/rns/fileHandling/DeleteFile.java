package rns.fileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file =
                new File("./Files/Demo/Java/rns.txt");
        if(file.delete()){
            System.out.println("File " + file.getName() + " deleted.");
        }else {
            System.out.println("File doesn't exist.");
        }
    }
}
