package arrays;

public class array2 {
    public static  int largest(int a[]) {//finding a largest value
        int lar=Integer.MIN_VALUE;//infinity
        for (int i = 0; i <  a.length; i++) {
         if(lar<a[i]){
             lar=a[i];
         }
        }
        return lar;
    }
    public static void main(String[] args) {
        int a[]={1,5,67,15,3,24};
        System.out.println(largest(a));

    }
}
