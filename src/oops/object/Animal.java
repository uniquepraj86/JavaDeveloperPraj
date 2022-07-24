package oops.object;

public class Animal {
    public void eat()
    {
        System.out.println("I am eating");
    }
    public static void main(String[] args)
    {
        System.out.println("cat");
        Animal cat =new Animal();
        cat.eat();
        cat.run();
        System.out.println("sparrow");
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
        System.out.println("I am fly");
    }
}