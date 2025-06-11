package collection;

import java.util.HashMap;
import java.util.Map;

public class usemystuu {
    public static void main(String[] args) {
        Map<Integer,mystuu>s=new HashMap<>();
        mystuu m1=new mystuu(101,"rohit",87.00);
        mystuu m2=new mystuu(102,"virat",77.00);
        mystuu m3=new mystuu(103,"kl rahul",93.00);
        s.put(m1.send(),m1);
        s.put(m2.send(),m2);
        s.put(m3.send(),m3);
       // System.out.println(s);
        //System.out.println(s.size());


    }
}
