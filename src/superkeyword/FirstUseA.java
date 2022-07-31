package superkeyword;

public class FirstUseA
{
    int i = 10;
}
    class B extends FirstUseA
{
    int i=20;
    void show(int i)
    {
        System.out.println(i); //30
        System.out.println(this.i); //20
        System.out.println(super.i);//10
    }

    public static void main(String[] args)
    {
        B ob=new B();
        ob.show(30



        );
    }
}
