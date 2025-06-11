package collection;

import java.util.TreeSet;

public class usebook {
    public static void main(String[] args) {
       TreeSet<book>s=new TreeSet<>();
        book b1=new book("java certification book=",450.55);
        book b2=new book("python",300.43);
        book b3=new book("c/c++ certification book",600.89);
        book b4=new book("dotnet certification book",300.43);
        s.add(b1);
        s.add(b2);
        s.add(b3);
        s.add(b4);
       System.out.println(s);
     System.out.println("costly books"+s.last()) ;
     System.out.println("small cost of books"+s.first());
     System.out.println(s.lower(b3));
     System.out.println(s.higher(b2));

        }

}
