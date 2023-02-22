package aaBasic20programs;

import java.util.Scanner;

/**
 *  The no which is equal to given number when it reverses
 *
 */
public class PalidromeNumber {
    public static void main(String[] args) {
        int r,temp,sum=0,no;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        no=sc.nextInt();
        temp = no;
        while (no>0)
        {
           r=no%10;
           no = no/10;
           sum=sum*10+r;
        }
        if(temp==sum) {
            System.out.println("palidrome");
        }
        else {
            System.out.println("Not A palidrome");
        }
    }

}
