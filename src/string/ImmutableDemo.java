package string;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s1="pune";
        String s2=s1;
        s1="mumbai";
        System.out.println(s1.concat("city"));
        System.out.println(s1);
        System.out.println(s2);

        int n1 = 10;
        int n2 = n1;
        n1 = n2 + 10;
        System.out.println(n1);
        System.out.println(n2);

    }
}
