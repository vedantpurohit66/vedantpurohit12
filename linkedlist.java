package collection;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        List<String>s=new LinkedList<String>();
        s.add("vedant");
        s.add("rohit");
        s.add("sumit");
        s.add("somesh");
        s.add("king");
        System.out.println(s.get(1));
        System.out.println(s.contains("vedant"));
        System.out.println(s.indexOf("somesh"));
        s.add(2,"sachin");
        System.out.println(s);
        System.out.println(s.size());
    }
    
}
