import java.util.*;
public class multiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[][] = new int[3][4];
        System.out.println("Enter the elements into the Matrix :");
        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements in the Matrix are :");

    // for(int i=0;i<3;i++){
    //         for (int j=0;j<4;j++){
    //            System.out.print(num[i][j] + " ");
    //         }
    //        System.out.println("");
    //     }


    
  // Enhanced for loop
    for(int i[] : num){
        for (int j : i){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
    }
}
