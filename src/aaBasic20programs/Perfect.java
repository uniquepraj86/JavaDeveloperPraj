package aaBasic20programs;

import java.util.Scanner;

/**
 * Perfect Number is number which is equal to sum of its factor
 */
public class Perfect {
    public static void main(String[] args) {
        int sum=0,no;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        no=sc.nextInt();
       for(int i=1;i<no;i++){
           if(no%i==0){
               sum = sum+i;
           }}
           if(sum==no){
               System.out.println(no+"Perfect No");
           }else {
               System.out.println(no+"Not Perfect");
           }


    }
}
