package arrays;

public class arrays {
    public static int[] twosum(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]s=arrays.twosum(arr,5);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
