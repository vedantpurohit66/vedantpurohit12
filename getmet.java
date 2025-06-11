package collection;

import java.util.HashMap;
import java.util.Map;

public class getmet {
    public static void main(String[] args) {
        Map<Integer, String> s = new HashMap<>();
        s.put(101, "vedant");
        s.put(102, "satish");
        s.put(103, "ajit");
        System.out.println(s.get(55));
        System.out.println(s.get(101));
        System.out.println(s.containsKey(101));
        System.out.println(s.containsValue("satish"));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.remove(103);
        System.out.println(s.get(103));
        System.out.println(s.values());
        System.out.println(s.keySet());
        System.out.println(s.entrySet());


        

    }
}
