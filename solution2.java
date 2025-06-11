package arrays;
//find max average of arrays according to key
public class solution2 {
    public static double findMaxAverage(int[]nums,int k){

            //  List<Double> l = new ArrayList<>();
       // double[]brr=new double[nums.length];
        double maxSum=Double.MIN_VALUE;
        int n = nums.length - 1;
        int i = 0;
        int k1 = k - 1;
        int sum = 0;

        while (k1 <= n) {
            for (int j = i; j <= k1; j++) {
                sum = sum + nums[j];


            }



            double f = (double) sum;

            if(maxSum<=f){
                maxSum=f;
            }

            i++;
            k1++;
            sum=0;

        }

        double ll =maxSum;
        ll=ll/4;

        return ll;

    }

    public static void main(String[] args) {
        int[]arr={-1};
        int k1=1;
        double x= Solution.findMaxAverage(arr,k1);
        System.out.println("hii"+x);
        System.out.println(Double.MIN_VALUE);


    }
}
