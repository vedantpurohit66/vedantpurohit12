package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist2 {
    public static void main(String[] args) {
        List<Integer>m=new ArrayList<>();
        m.add(34);
        m.add(44);
        m.add(13);
        m.add(78);
        m.add(47);
        int k=m.get(0);
        System.out.println(k);

       Collections.sort(m, Collections.reverseOrder());

        System.out.println(m);
    }
}
