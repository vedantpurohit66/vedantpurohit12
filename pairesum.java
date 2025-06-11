package arrays;

public class pairesum {

    public static int find(int[]arr,int total){
int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == total) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr={4,6,8,9,11,14};
        System.out.println(pairesum.find(arr,6));

    }
}
