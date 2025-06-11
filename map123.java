package collection;

import java.util.*;

public class map123 {
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3,3,3,3,3};
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }
        }
        int[]nums=new int[arr.length];
        Collection<Integer>c=m.values();
        Iterator<Integer>it=c.iterator();
        int j=0;
        while(it.hasNext()){
            int value=it.next();
            nums[j]=value;

        }
        Arrays.sort(nums);
        int v=nums[nums.length-1];
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()==v){
                System.out.println("paire="+v+" "+e.getKey());
            }
        }
    }
}
