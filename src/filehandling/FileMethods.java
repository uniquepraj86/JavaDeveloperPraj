package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/filehandling/codkul.txt");
        try{
            if(file.createNewFile())
                System.out.println("File is created ");
            else {
                System.out.println("File Exist");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("IS FILE "+file.isFile());
        System.out.println("Is File " +file.getPath());
        System.out.println("IS File"+file.getName());
    }
}
