package collection;

import java.util.*;

public class map12 {
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        int[]arr=new int[4];

        m.put(0,0);
        m.put(1,11);
        m.put(21,267);
        m.put(3,34);
        Collection<Integer>c=m.values();
        Iterator<Integer>it=c.iterator();
        int i=0;
        while(it.hasNext()){
            Integer value=it.next();
            int val=value;
            //System.out.println(val);

            arr[i]=val;
            i++;
        }
        Arrays.sort(arr);
        int g=arr[arr.length-1];
        System.out.println("highest number ="+arr[arr.length-1]);
        for(Map.Entry<Integer,Integer>e:m.entrySet()){
            if(e.getValue()==g){
                System.out.println("key="+e.getKey());
            }
        }









    }
}
