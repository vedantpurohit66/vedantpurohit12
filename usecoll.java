package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class usecoll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer, coll> s = new HashMap<>();
        coll o1 = new coll(1, "virat", 88.9);
        coll o2 = new coll(2, "rohit", 87.6);
        coll o3 = new coll(3, "rahul", 78.5);
        s.put(101,o1);
        s.put(102,o2);
        s.put(103,o3);
      //  System.out.println("enter student roll no");
       // int roll1;
       // roll1= sc.nextInt();
      /*  boolean result=s.containsKey(roll1);
        if(result==true){
            System.out.println("student is present");
        }
        else{
            System.out.println("student is not present");
        }

       */
        int roll;
        System.out.println("enter roll no");
        roll=sc.nextInt();
        coll result=s.get(roll);
        if(result==null){
            System.out.println("no student is founds");
        }
        else{
            System.out.println("student is found");
            System.out.println(result);
        }
    }
}
