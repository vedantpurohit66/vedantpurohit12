package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class useemp1 {
    public static void main(String[] args) {
        List<emp1> s = new ArrayList<>();
        emp1 e1 = new emp1(4, "virat", 85.5);
        emp1 e2 = new emp1(1, "rohit", 55.5);
        emp1 e3 = new emp1(3, "kl rahul", 99.5);
        emp1 e4 = new emp1(2, "shubman", 95.5);
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
      //  System.out.println(s);
       Collections.sort(s);
        System.out.println(s);



    }

}
