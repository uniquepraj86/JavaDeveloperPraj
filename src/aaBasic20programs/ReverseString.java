package aaBasic20programs;

import java.util.Locale;

public class ReverseString {
    public static void main(String[] args) {

        String str = "I Am Prajakta";
        String st = " ";
        for (int i=str.length()-1;i>=0;i--){
            st = st+str.charAt(i);
        }
        System.out.println(st);
    }
}
