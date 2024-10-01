import java.util.*;

// Better Approach

class setZeroes{
    public static void setZeroes(int[][] matrix, int n, int m) {
        int i,j;
        int row[]= new int[n];
        int col[]=new int[m];
         
        // setting the matrix to -1's in place of zero
        for(  i=0;i<n;i++){
            for( j=0;j<m;j++){
                if(matrix[i][j]==0){  // nxm
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }

        // setting the matix to zero in place of 1's
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){     //nxm
                if(row[i]==-1 || col [j]==-1)
                matrix[i][j]=0;
            }
        }

        // Printing the final array
        System.out.println("The resultant matrix is : ");
         for( int arr[] : matrix){
        for ( int rarr : arr){                   //nxm
            System.out.print(rarr+" ");
        }
        System.out.println("");
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and col size :");
        int n =sc.nextInt();       //No of rows
        int m = sc.nextInt();     //No of columns
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