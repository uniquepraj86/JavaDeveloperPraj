package colletion;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("pune");
        list.add("pune");
        list.add("Chennai");
        list.add("Kolkata");
        list.add("Madras");
        list.add("aps");

//        System.out.println(list);
//        System.out.println(list.size());
//        list.add(3,"Bangalore");
//        System.out.println(list);
//        if (!list.isEmpty()){
//
//        }
//        System.out.println(list.get(2));
//        System.out.println(list.contains("Madras1"));
//        System.out.println(list.indexOf("Bangalore"));
//        //list.containsAll()
//        list.remove("Kolkata");
//        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));
        System.out.println(list.toArray().length);


    }
}
