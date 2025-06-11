package collection;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String>s=new ArrayList<String>();
        s.add("janaury");
        s.add("februry");
        s.add("march");
        s.add("april");
        System.out.println(s);
        System.out.println(s.contains("march"));
        int index=s.indexOf("april");
        System.out.println(index);
        s.remove("march");
       System.out.println(s);
       int size=s.size();
        System.out.println(size);


    }
}
