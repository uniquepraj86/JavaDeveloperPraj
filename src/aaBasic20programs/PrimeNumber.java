package aaBasic20programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//
//        int a,count;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//
//        a= sc.nextInt();
//        for(int i=1;i<=a;i++){
//            count=0;
//            for (int j=2;j<=i/2;j++){
//                if(i%j==0){
//                    count++;
//                    break;
//                }
//            }
//            if(count == 0){
//                System.out.println(i);
//            }
//        }
        int a,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a =sc.nextInt();
        for (int i=1;i<=a;i++){
            if(a%i==0){
                count = count+1;
            }
        }
        if(count==2){
            System.out.println(a+"Is Prime");

        }else {
            System.out.println(a+"Is Not prime Number");
        }

   }

}
