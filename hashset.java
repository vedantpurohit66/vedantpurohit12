package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
       HashSet<String>s=new HashSet<>();
        System.out.println(s.add("vedant"));
        System.out.println(s.add("satish"));
        System.out.println(s.add("devans"));
        System.out.println(s.add("vedant"));
        System.out.println(s);
        System.out.println(s.contains("vedant"));
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
