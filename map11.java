package collection;

import java.util.HashMap;
import java.util.Map;

public class map11 {
    public static void main(String[] args) {
        Map<Integer,String>s=new HashMap<>();
        String res;
        res=s.put(1,"vedant");
        System.out.println("after adding 1st students "+res);
        res=s.put(102,"rahuul");
        System.out.println("after adding 2st students "+res);
        res=s.put(103,"ketrina");
        System.out.println("after adding 3st students "+res);
        res=s.put(104,"seema");
        System.out.println("after adding 4st students "+res);
        res=s.put(105,"amit");
        System.out.println("after adding 5st students "+res);
        System.out.println(s);

    }
}
