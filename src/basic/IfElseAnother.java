package basic;

public class IfElseAnother {
    public static void main(String[] args) {
        int a=70;
        int b=10;
        int c=10;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greater than c");
            }
            else {
                   System.out.println("c is greater than a");
                 }
        }
            if(b>c)
        {
            System.out.println("b is greater than c");
        }
            else{
                System.out.println("c is greater than a");
            }
    }
}
