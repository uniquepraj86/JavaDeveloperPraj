package string;

import java.util.Locale;
import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc .next();
        String nameArray[] = name.split(" ");
        System.out.println(nameArray.length);
        for(String s:nameArray){
            System.out.println(s);
        }
        char firstInitial = nameArray[0].toUpperCase().charAt(0);
        char MiddleInitial = nameArray[1].toUpperCase().charAt(0);
        char LastInitial = nameArray[2].toUpperCase().charAt(0);


    }
}

