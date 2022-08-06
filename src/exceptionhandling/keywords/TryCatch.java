package exceptionhandling.keywords;
import java.util.Scanner;


public class TryCatch {
    public static void main(String[] args) {
        int a;
        int b;
        int result = 10;
        String str=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            result = a / b;
            System.out.println(str.toLowerCase());
            System.out.println("4");
            System.out.println("5");
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
            System.out.println("str is Null");
            //  String str = "CODKUL";
            //  System.out.println(str.toLowerCase());
        }
        System.out.println("Result"+result);
        System.out.println("Rest of the code");

    }
}



