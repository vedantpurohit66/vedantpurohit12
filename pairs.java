package arrays;

public class pairs {
    //pairs in an arrays
    public static void pairs(int number[]){
        for(int i=0;i<number.length;i++){
            int cur=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+cur+" "+number[j]+")");
            }
            System.out.println();
        }
    }
     public static void main(String[]args) {
        int number[]={2,4,6,8,10};
        pairs(number);
    }
}
