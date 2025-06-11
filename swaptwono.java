package collection;

import java.util.ArrayList;

public class swaptwono {
    ArrayList<Integer> list1;
    public static  void swap(ArrayList<Integer>list1,int idx1,int idx2){
        int temp=list1.get(idx1);
        list1.set(idx1,list1.get(idx2));
        list1.set(idx2,temp);
        System.out.println(list1);




    }
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list1.add(4);
        list1.add(5);
        swaptwono.swap(list1,0,3);


    }
}
