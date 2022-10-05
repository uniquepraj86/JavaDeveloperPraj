package exceptionhandling;

import java.io.File;
import java.io.IOException;

public class IOExceptionDemo{
//    public static void main(String[] args) {
//        File file = new File("abc.txt");
//        //IOException
//        //  file.createNewFile(); //checked/compile exception
//    }

    public static void main(String[] args) throws IOException {
        File file = new File("abc.text");
        file.createNewFile();
    }




}
