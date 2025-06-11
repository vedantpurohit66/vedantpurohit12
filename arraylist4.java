package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>s=new ArrayList<>(5);
        System.out.println("enter five fruit name");
        for(int i=0;i<5;i++){
            String name=sc.nextLine();
           s.add(name);
        }
        System.out.println("enter fruits name which you hava to removed");
        String p=sc.nextLine();
       boolean k= s.remove(p);
        if(k==false){
            System.out.println("fruits not founds");
        }
        else{
            System.out.println(s);
        }

    }
}
