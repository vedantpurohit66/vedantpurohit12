package collection;

import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        Map<Integer,String >student=new HashMap<>();
        student.put(109,"amit");
        student.clear();
       // student.put(108,"deepak");
        student.put(117,"ravi");
        student.put(103,"vedant");
        student.put(113,"satish");
        student.put(114,"rahul");
        student.put(114,"sahil");

        Object i=student.get(117);
        System.out.println(i);

        System.out.println(student.values());
        System.out.println(student.getOrDefault(108,"hello"));
        System.out.println(student.get(114));


        System.out.println(student.get(107));
        System.out.println(student.get(109));
        System.out.println(student.get(108));
        System.out.println(student.containsKey(108));
        System.out.println(student.containsValue("ravi"));
        System.out.println(student.isEmpty());
        System.out.println(student.size());
      //  System.out.println(student.remove(108));
        System.out.println(student.get(108));
        //System.out.println(student.remove(77));
     //   System.out.println(student.values());
        System.out.println(student.keySet());
       // System.out.println(student.entrySet());
       // System.out.println(student);



    }

}
