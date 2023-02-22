package aaBasic20programs;

import java.util.Scanner;

/**
 * the sum of cube of each digit called
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int r,sum=0,no;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        no=sc.nextInt();
        int temp = no;
       while (no>0)
       {
           r = no%10;
           no = no/10;
           sum=sum+r*r*r;
       }
       if(temp == sum)
       {
           System.out.println("ArmStrong Number");
       }
       else {
           System.out.println("Not a ArmStrong Number");
       }
    }
}
