package collection;

import java.util.HashMap;
import java.util.Map;

public class usemap8 {
    public static void main(String[] args) {
        Map<Integer,map8>s=new HashMap<>();
        map8 o1=new map8(1,"  rahul", 55.5,44);
        map8 o2=new map8(2,"  rohit", 77.8,55);
        map8 o3=new map8(3,"  virat", 67.5,75);
        map8 o4=new map8(4,"  klrahul", 85.5,54);
        s.put(101,o1);
        s.put(102,o2);
        s.put(103,o3);
        s.put(104,o4);
        System.out.println(s);




    }
}
