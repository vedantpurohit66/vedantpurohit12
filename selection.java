package arrays;

public class selection  {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"  ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }




    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        selectionSort(arr);
        print(arr);
    }
}
