package arrays;
public class smallest {
    public static int large(int a[]){
        int small=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(small<a[i]){
                small=a[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int a[]={1,5,8,32,13,5,0};
        System.out.println(large(a));
    }
}
