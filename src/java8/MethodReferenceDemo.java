package java8;

//@FunctionalInterface
//interface Printer{
//    void print(String str);
//}
//
//public class MethodReferenceDemo {
//    public static void main(String[] args) {
////  Printer printer =()-> System.out.println("hi");
//        Printer printer =(str)-> System.out.println(str);
//        //Method Reference
//        Printer printer1 = System.out::println;  //Spoke Resolution Operator
//        printer1.print("Welcome Java");
//    }
//}

@FunctionalInterface
interface Printer{
    void print(String str);
}
public class MethodReferenceDemo {
    public static void main(String[] args) {
        Printer printer = (str)-> System.out.println(str);
        Printer printer1 = System.out::println;
        printer1.print("Welcome java");
    }
}



