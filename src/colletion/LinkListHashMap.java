package colletion;
// it follows insersion order.
//non-synchronise

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkListHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map =new LinkedHashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        System.out.println(map);
        map.put(null,null);
        System.out.println(map);
        map.put(null,"p");
        System.out.println(map);
        map.put(6,null);
        System.out.println(map);
    }
    }
