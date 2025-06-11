package arrays;

public class binarySearch {
    //prerequisite_ sorted arrays
    public static int binarySearch(int number[],int key){
      int start=0;
      int end=number.length-1;
      while(start<=end){
          int mid=(start+end)/2;
          if(number[mid]==key){
              return mid;
          }
          else if(number[mid]>key){
              end=mid-1;
          }
          else{
              start=mid+1;
          }
      }
      return -1;
    }
    public static void main(String[] args) {
        int number[]={2,5,7,9,12};
        System.out.println(binarySearch(number,9));
    }

    
}
