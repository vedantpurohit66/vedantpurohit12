package arrays;

public class array1 {
    public  int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        array1 a1=new array1();
         int a[]={4,2,4,6,8,10,12};
        System.out.println(a1.linearSearch(a,4));

    }
}
