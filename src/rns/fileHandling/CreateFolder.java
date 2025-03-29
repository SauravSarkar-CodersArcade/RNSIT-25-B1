package rns.fileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File folder = new File("D:\\Idea Projects\\RNSIT-March25-B1\\Files\\Demo");
        if(folder.mkdir()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Folder already exists.");
        }
    }
}
