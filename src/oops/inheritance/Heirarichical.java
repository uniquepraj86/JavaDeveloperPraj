package oops.inheritance;

public class Heirarichical {
    void showHeirarichicalA()
    {
        System.out.println("a class method");
    }
}
class HeiraricalB extends Heirarichical
{
    void showHeirarichicalB()
    {
        System.out.println("b class method");
    }
}
class HeirarichicalC extends Heirarichical {
    void showHeiraricalC() {
        System.out.println("c class method");
    }

    public static void main(String[] args)
    {
        Heirarichical ob1=new Heirarichical();
        ob1.showHeirarichicalA();
        System.out.println("................");


        HeiraricalB ob2=new HeiraricalB();
        ob2.showHeirarichicalA();
        ob2.showHeirarichicalB();
        System.out.println("................");

        HeirarichicalC ob3=new HeirarichicalC();
        ob3.showHeirarichicalA();
        ob3.showHeiraricalC();
    }
}