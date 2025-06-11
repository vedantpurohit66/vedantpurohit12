package collection;

import java.util.ArrayList;
import java.util.List;

public class useemp5 {
    public static void main(String[] args) {
        List<emp5>s= new ArrayList<>();
        emp5 e1=new emp5(1,"vedant");
        emp5 e2=new emp5(2,"kl");
        emp5 e3=new emp5(3,"virat");
        emp5 e4=new emp5(4,"rishav");
        emp5 e5=new emp5(5,"hardik");
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        s.add(e5);
      //  Collections.sort(s);
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
    }
}
