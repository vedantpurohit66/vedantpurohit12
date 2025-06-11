package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist5 {
    public static void main(String[] args) {
        List<String>s=new ArrayList<>();
        s.add("d");
        s.add("c");
        s.add("a");
        s.add("b");
        Collections.sort(s);
        System.out.println(s.indexOf(2));
        System.out.println(s);

    }
}
