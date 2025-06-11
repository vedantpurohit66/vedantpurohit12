package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Set<Integer>s=new TreeSet<>();
        s.add(5);
        s.add(1);
        s.add(2);
        s.add(3);
        Iterator it=s.iterator();
        while(it.hasNext()){
            Integer i=(Integer) it.next();
            System.out.println(i);
        }

    }
}
