package collection;

import java.util.ArrayList;

public class pairsumByTwoPointerApproach {
     public static boolean pairesum(ArrayList<Integer>l,int target){
         int lp=0;
         int rp=l.size()-1;
         while(lp!=rp){
             //case 1
             if (l.get(lp)+l.get(rp)==target) {
                 return true;
             }
             if(l.get(lp)+l.get(rp) < target){
                 lp++;
             }
             else{
                 rp--;
             }
         }
         return false;
     }
    public static void main(String[] args) {

        ArrayList<Integer>l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        int target=5;
        System.out.println(pairesum(l,target));


    }
}
