
package controlflowstmt;

import java.util.Scanner;

public class Table1 { public static void main(String[] args) {
    // int no = Integer.parseInt(args[0]);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int no = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
        System.out.println(no * i);
    }
}
}
