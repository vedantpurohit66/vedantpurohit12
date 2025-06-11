package arrays;

import java.util.Arrays;

public class duplicates {
    public static void find(int[]arr){

        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("duplicate="+arr[i]+" ");


            }

        }

    }
    public static void main(String[] args) {
        int []arr={3,2,3,1,6,7,1,6};
        duplicates.find(arr);

    }
}
