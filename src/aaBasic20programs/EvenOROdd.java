package aaBasic20programs;

import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no");
        a=sc.nextInt();


            if(a%2==0){
                System.out.println(a+" Even Number");
            }else {
                System.out.println(a+" Odd number");
            }
        }
    }

