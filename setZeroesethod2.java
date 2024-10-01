import java.util.Scanner;

public class setZeroesethod2 {
    
    public static void setZeroes(int[][] matrix,int n, int m) {
        n = matrix.length;
        m=matrix[0].length;
        int i,j;
        for(i=0;i<n;i++){
            for( j=0;j<m;j++){
                if(matrix[i][j]==0){
                   static void  markRow(i);
                     static void markCol(j);
                }
            }
        }
        markRow(){
            for(j=0;j<m;j++){
                if(matrix[i][j]!=0){
                matrix[i][j]=-1;
                }
            }
        }
        markCol(){
            for(i=0;i<n;i++){
                if(matrix[i][j]!=0){
                matrix[i][j]=-1;
                }

        }
    }
    System.out.println("The resultant matrix is : ");
    for( int arr[] : matrix){
   for ( int rarr : arr){                   //nxm
       System.out.print(rarr+" ");
   }
   System.out.println("");
}
}
public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    int n=3;
    int m=4;
    int arr[][]=new int[n][m];
    System.out.print("Enter the elements into the matrix :");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<m;j++){      //nxm
            arr[i][j]=sc.nextInt();
        }
}
  setZeroes(arr,n,m);
}
}

