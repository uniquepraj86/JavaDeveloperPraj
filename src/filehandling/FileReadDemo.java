package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo {
    public static <PdfReader> void main(String[] args) throws IOException {
        File file = new File("./src/filehandling/input.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}