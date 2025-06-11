package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map3 {
    public static void main(String[] args) {
        Map<String,Long>s=new HashMap<>();
        s.put("sachin",8120543453L);
        s.put("afroz",6264427919L);
        s.put("vedant",9303014276L);
        System.out.println(s.keySet());
        System.out.println(s.entrySet());
        System.out.println(s.get("vedant"));
        int i=0;
        while(i<2){
            Set k=s.keySet();
            System.out.println(k);
            i++;
        }

    }
}
