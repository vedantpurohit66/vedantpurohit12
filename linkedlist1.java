package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class linkedlist1 implements Comparable<linkedlist1> {
    int id;
    String name;
    Double sal;
    public linkedlist1(int id,String name,double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    @Override
    public String toString() {
        return "id="+id+", name="+name+", salary="+sal;
    }

    @Override
    public int compareTo(linkedlist1 o) {
        return this.sal.compareTo(o.sal);
    }

    public static void main(String[] args) {
        List<linkedlist1>m=new LinkedList<linkedlist1>();
        linkedlist1 l1=new linkedlist1(1,"rahul",70000.0);
        linkedlist1 l2=new linkedlist1(2,"sumit",60000.0);
        linkedlist1 l3=new linkedlist1(3,"virat",90000.0);
        m.add(l1);
        m.add(l2);
        m.add(l3);
        Collections.sort(m);
        System.out.println(m);






    }
}
