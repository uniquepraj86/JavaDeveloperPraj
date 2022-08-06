package exceptionhandling;

import java.security.KeyPair;
import java.util.Scanner;

public class VacinationCriteria
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();
        try
        {
            validateAge(age);
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age)
    {
        if (age<18||age>55)
        {
            throw new ArithmeticException("you are not eligible for vaccine");
        }else {
            System.out.println("you are eligible for vaccine");
        }
    }
}
