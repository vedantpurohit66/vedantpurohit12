package collection;

import java.util.HashMap;
import java.util.Map;

public class map2 {
    public static void main(String[] args) {
        Map<Integer,String>s=new HashMap<>();
        String result;
        result=s.put(101,"rahul");
        System.out.println("after adding first student"+result);
        result=s.put(101,"deepak");
        System.out.println("after adding second student"+result);
        result=s.put(103,"ravi");
        System.out.println("after adding third student"+result);
        result=s.put(104,"deepesh");
        System.out.println("after adding fourth student"+result);
        System.out.println(s.size());
        System.out.println(s);
        for(int i:s.keySet()){
            System.out.println(i);

        }





    }
}
