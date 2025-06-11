package collection;

import java.util.HashMap;
import java.util.Map;

public class usehashmap {
    public static void main(String[] args) {
        Map<hashmap,Integer>s=new HashMap<>();
        hashmap o1=new hashmap(1,"vedant",94.5);
        hashmap o2=new hashmap(2,"satish",91.5);
        hashmap o3=new hashmap(3,"virat",72.5);
        hashmap o4=new hashmap(4,"rohit",67.5);
        s.put(o1,o1.getRoll(101));
        s.put(o2,o2.getRoll(102));
        s.put(o3, o3.getRoll(103));
        s.put(o4, o4.getRoll(104));
        System.out.println(s);
    }
}
