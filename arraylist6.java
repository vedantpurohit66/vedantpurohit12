package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class arraylist6 {
    public static void main(String[] args) {
        List<String> s=new LinkedList<>();
        s.add("vedant");
        s.add("purohit");
        s.add("rahul");
        Iterator it=s.iterator();
        while(it.hasNext()){
            String a=(String) it.next();
            System.out.println(a);
        }
    }
}
