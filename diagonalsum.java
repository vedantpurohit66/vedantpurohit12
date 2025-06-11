package arrays;

public class diagonalsum {
    public static void diagsum(int matrix[][]){
        int sum=0;

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }
               /* if(i+j== matrix.length-1){
                    if(i==j){
                        break;
                    }
                    sum=sum+matrix[i][j];
                }*/
            }
        }
        System.out.println("sum="+sum);


    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        diagsum(matrix);
    }
}
