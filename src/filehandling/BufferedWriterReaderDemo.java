package filehandling;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.*;

public class BufferedWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        String path = "./src/filehandling/java.txt";
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Java is Object-Oriented Language");
        bufferedWriter.close();
        fileWriter.close();





    }
}