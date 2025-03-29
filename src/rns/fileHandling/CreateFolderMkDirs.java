package rns.fileHandling;

import java.io.File;

public class CreateFolderMkDirs {
    public static void main(String[] args) {
        File folder =
                new File("D:\\Idea Projects\\RNSIT-March25-B1\\Files\\Demo\\Java\\Files");
        if(folder.mkdirs()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Folder already exists.");
        }
    }
}
