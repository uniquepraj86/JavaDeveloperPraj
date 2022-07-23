package basic;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {

        int no=5;
        int fact=1;
        for(int i=1; i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+no+ " is : "+fact);
    }
}






