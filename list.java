package collection;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String>f=new ArrayList<>();
        f.add("jan");
        f.add("feb");
        f.add("march");
        f.add(1,"may");
        System.out.println(f);
    }
}
