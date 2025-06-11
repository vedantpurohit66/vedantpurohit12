package collection;

import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        if(arr.contains(1)){
            System.out.println("hii");
        }
        Object o=arr.get(0);
        String s=String.valueOf(o);
        System.out.println(s);
        int i=Integer.parseInt(s);
        System.out.println(i);



    }
}
