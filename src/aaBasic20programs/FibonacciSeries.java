package aaBasic20programs;

import java.util.Scanner;

/**
 * Addition of two series is called fibonacciSeries
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int p=0;
        int c=1;
        int nxt=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(nxt);
            nxt = p+c;
            p=c;
            c=nxt;
        }

    }
}
