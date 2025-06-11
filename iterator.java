package collection;

import java.util.*;

public class iterator {
    public static void main(String[] args) {
        Map<Integer, String> student = new TreeMap<>();
        student.put(109, "amit");
        student.clear();
        student.put(108, "deepak");
        student.put(103, "ravi");
        student.put(112, "vedant");
        student.put(113, "satish");
        student.put(114 , "satish");
        Set s=student.entrySet();
        Iterator it=s.iterator();
        while(it.hasNext()){
            Map.Entry i=(Map.Entry)it.next();
            System.out.println(i.getKey()+","+i.getValue());
        }
    }
}