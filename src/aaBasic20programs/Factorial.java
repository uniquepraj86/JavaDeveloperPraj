package aaBasic20programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

//        int fact=1, no;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        no = sc.nextInt();
//        for (int i = 1; i <= no; i++) {
//            fact = fact * i;
//
//        }
//        System.out.println(fact);

        int fact = 1, no;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        no =s.nextInt();
        for (int i = 1;i<=no;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
