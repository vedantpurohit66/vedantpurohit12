package arrays;

import java.util.Arrays;

//second largest parameter
public class arraysQuestion {
    public static int find(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        int[]arr={1,23,11,6,53,26};
        System.out.println(arraysQuestion.find(arr));


    }
}
