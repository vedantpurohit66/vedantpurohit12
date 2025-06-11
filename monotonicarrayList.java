package collection;

import java.util.ArrayList;

public class monotonicarrayList {
    public static boolean isMonotonic(ArrayList<Integer>l){
        boolean inc=true;
        boolean dec=true;
    //    boolean desc=true;
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i)>l.get(i+1)){
                inc=false;
            }
            if(l.get(i)<l.get(i+1)){
                dec=false;
            }
        }
        return inc||dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(5);
        boolean a=monotonicarrayList.isMonotonic(l);
        if(a==true){
            System.out.println("monotonic");
        }
        else{
            System.out.println(" not monotonic");
        }

    }
}
