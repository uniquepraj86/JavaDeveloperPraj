import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"Amit");
        map.put(2,"sneha");
        map.put(3,"pratik");
        map.put(4,"asha");
        map.put(3,"pranali");
        System.out.println(map);
        map.put(3,"ashish");
        System.out.println(map);
        map.put(null,null);
        System.out.println(map);
        map .put(null,"jiya");
        System.out.println(map);
        map.put(2,null);
        System.out.println(map);
        System.out.println(map.get(1));
       Iterator iterator = map.entrySet().iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
  map.remove(2);
        System.out.println(map);




//hashig tecking
//        hash code object class method
//        hash code returns integer
//        internal Structure of
    }
}
