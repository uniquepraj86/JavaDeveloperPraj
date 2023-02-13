package controlflowstmt;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int no,a,b = 0,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        no = sc.nextInt();

        while(no>0){
            a = no%10;
            no = no/10;
            temp = temp * 10+a;

        }
        if(temp == b)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
