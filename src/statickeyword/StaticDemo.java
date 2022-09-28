package statickeyword;

public class StaticDemo {
    int id;
    String name;
//    String companyName;

    static String CompanyName = "xyx";

    static {                                  //static block - to initialise static data
        System.out.println("Static block");
    }


    public StaticDemo(int id, String name) {  //outer class can not be classic but inner class is static
        this.id = id;
        this.name = name;
//        this.companyName = companyName;
    }

    public StaticDemo() {

    }


     class Inner {
        static int id = 10;
        static String name = " shiv";

    }


    public static void show() {
        System.out.println("static Method");
    }

    public static void main(String[] args) {
//        StaticDemo obj = new StaticDemo(1,"Satya");
//        StaticDemo obj1 = new StaticDemo(2,"Shiva");
//        StaticDemo obj2 = new StaticDemo(1,"Sana");
//
//
//        System.out.println(obj.id+" "+obj.name+" "+obj.CompanyName);
//        System.out.println(obj1.id+" "+obj1.name+" "+obj.CompanyName);
//        System.out.println(obj2.id+" "+obj2.name+" "+obj.CompanyName);
//          show();

        StaticDemo obj = new StaticDemo();
        StaticDemo.Inner obj2 = obj.new Inner();
        System.out.println(obj2.id);
        System.out.println(Inner.name);
    }
}
