package practice;

import java.util.Scanner;

public class Marks {  public static void main(String[] args) {
    int mark;
    Scanner scanner=new Scanner(System.in);
    System.out.println("*********** Enter Marks **********");

    mark=scanner.nextInt();
    if (mark>=90&&mark<=100) {
        System.out.println("O");
    }
    else if (mark>=80&&mark<90) {
        System.out.println("A+");
    }
    else if (mark>=70&&mark<80) {
        System.out.println("A");
    }
    else if (mark>=60&&mark<70) {
        System.out.println("B+");
    }
    else if (mark>=50&&mark<60) {
        System.out.println("C+");
    }
    else if (mark>=40&&mark<50) {
        System.out.println("C");
    }
    else if (mark>=35&&mark<40) {
        System.out.println("D");
    }
    else if (mark<35) {
        System.out.println("Fail");
    }
    else {
        System.out.println("Not Correct");
    }
}
}
