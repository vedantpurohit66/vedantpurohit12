package collection;

public class pairsum {
    public static void find(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if((arr[i]+arr[j])==target){
                    System.out.println("index is"+i+","+j);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        pairsum.find(arr,5);

    }



}
