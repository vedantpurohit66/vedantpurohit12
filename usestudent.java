package collection;

import java.util.HashSet;
import java.util.Set;

public class usestudent {
    public static void main(String[] args) {
        Set<student>s=new HashSet<>();
        student s1=new student("vedant");
        student s2=new student("purohit");
        student s3=new student("vedant");
        s.add(s1);
        s.add(s2);
        s.add(s3);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

         





    }
}
