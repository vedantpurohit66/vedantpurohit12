package arrays;//max sub array
//brute force
//print sub arrays
public class printsubarray {
    //maxp sub arrays

    public static void printsubarray1(int number[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< number.length;i++){
            for(int j=i+1;j< number.length;j++){
                int end=j;
                sum=0;
                for(int k=i;k<=j;k++){
                   // System.out.print(number[k]);//print subarray
                    sum=sum+number[k];


                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
                System.out.println();
            }
                System.out.println();
        }
        System.out.println("max array="+max);
    }

    public static void main(String[] args) {
       int number[]={2,4,6,8,10};
        printsubarray1(number);


    }




}
