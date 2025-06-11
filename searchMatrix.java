package arrays;

public class searchMatrix {
    public static void search(int matrix[][]){
        for(int i=0;i< 3;i++){
           for( int j=0;j<3;j++){
               if(matrix[i][j]==6){
                   System.out.println("index="+i+" "+j);
               }
           }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        search(matrix);


    }
}
