package colletion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"praj");
        map.put(2,"sneha");
        map.put(3,"ruth");
        map.put(4,"pranali");
        System.out.println(map);
//        map.put(null,null);
//        System.out.println(map);
//        map.put(1,null);
//        System.out.println(map);
//        map.put(null,"praj");
//        System.out.println(map);
//        System.out.println(map.get(5));
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        map.remove(5);
        System.out.println(map);
    }

}
