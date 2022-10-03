package oops.object;

public class Ani {
    public  void eat()
    {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        System.out.println("I am Cat");
        Ani ani = new Ani();
        ani.eat();
        ani.run();
        System.out.println("I am sparrow");


    }

    private void run() {
        System.out.println(" i am running");
    }
}
