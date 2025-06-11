package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>s=new ArrayList<>();
        s.add("pathan");
        s.add("gadar2");
        s.add("the kerela story");
        s.add("adipurush");
        s.add("TJMM");
        System.out.println("enter movie name");
        String p=sc.next();
        int index=s.indexOf(p);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("rank of movie is"+(index)+1);
        }

    }
}
