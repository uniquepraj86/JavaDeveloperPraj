package oops.object;

public class animal {
    public void eat()
    {
        System.out.println("I am eating");
    }
    public static void main(String[] args)
    {
        System.out.println("cat");
        animal cat =new animal();
        cat.eat();
        cat.run();
        System.out.println("Sparrow");
        Birds sp=new Birds();
         sp.fly();
    }
    public void run()
    {
        System.out.println("I am running");
    }
}
class Birds
{
    void fly()
    {
        System.out.println("Sparrow:- I am fly");
    }
}