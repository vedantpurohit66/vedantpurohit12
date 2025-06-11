package arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        List<Double> l = new ArrayList<>();

        int n = nums.length - 1;
        int i = 0;
        int k1 = k - 1;
        int sum = 0;
        while (k1 <= n) {
            for (int j = i; j <= k1; j++) {
                sum = sum + nums[j];

            }

            double f = (double) sum;
            l.add(f);
            i++;
            k1++;
            sum=0;


        }
        Collections.sort(l);
        Object gd = l.get(l.size()-1);


        String str = gd.toString();
        double ll = Double.parseDouble(str);
        ll=ll/k;
        return ll;

    }

    public static void main(String[] args) {
        int[]arr={1,12,-5,-6,50,3};
        int k1=4;
      double x= Solution.findMaxAverage(arr,k1);
        System.out.println(x);


    }
}
