package basic;

public class IfElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;
        if (a>b && a>c) {
            System.out.println("a greter number");
        }
        else if(b>c && b>a)
        {
            System.out.println("b is Greter number");
        }
        else
        {
            System.out.println("c is Greter number");
        }
    }
}
