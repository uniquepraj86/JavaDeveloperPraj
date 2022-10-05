package exceptionhandling;

import java.util.Locale;

public class NullPointerExecptionDemo {
//    public static void main(String[] args) {
//        int a[]={1,2,3,4,5};
//        System.out.println(a[6]);
//        String name = null;
//        System.out.println(name.toLowerCase());
//    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,};
//        String b[] = {"praj"};
        System.out.println(a[6]);
//        System.out.println(b.toString());
        String name = null;
        System.out.println(name.toUpperCase());
    }
}
