//package filehandling;
//
//
//import com.itextpdf.text.pdf.PdfReader;
//import com.itextpdf.text.pdf.parser.PdfTextExtractor;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class FileReadDemo {
//    public static void main(String[] args) throws IOException {
//        File file = new File("./src/filehandling/input.txt");
//        try {
//            Scanner sc = new Scanner(file);
//            while (sc.hasNext()) {
//                System.out.println(sc.next());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        PdfReader pdfReader = new PdfReader("./src/filehandling/pdffile.pdf");
//        String reader = PdfTextExtractor.getTextFromPage(pdfReader,1);
//        System.out.println(reader);
//        pdfReader.close();
//    }
//}