package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class useemp {
    public static void main(String[] args) {
        List<emp>s=new ArrayList<>();
        emp e1=new emp(23,"rahul",50000);
        emp e2=new emp(43,"mohit",90000);
        emp e3=new emp(28,"sachin",60000);
        emp e4=new emp(36,"mukesh",78000);
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
      //  s.remove(2);
        System.out.println(s);
       Collections.sort(s);
        System.out.println(s);
    }
}
