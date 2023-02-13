package controlflowstmt;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int no,rem,rev=0;
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        while (no!=0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println(rev);
    }
}
