import java.util.*;
import java.io.*;
import java.math.*;
public class closestNumberToZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt(); // the number of temperatures to analyse
        int arr[]=new int[n];
        System.out.print("Enter the elements into the array :");
        for (int k = 0; k < n; k++) {
           // int t = sc.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            arr[k]=sc.nextInt();
        }

        // //Sorting
        //  for(int i=0;i<=n-2;i++){
        //         int smallest = i;
        //         for(int j=i;j<=n-1;j++){ 
        //          if(arr[smallest]>arr[j]){
        //          smallest=j;       
        //         }                
        //     }
        //         int temp = arr[smallest];
        //         arr[smallest]=arr[i];              
        //        arr[i]=temp;

        //     }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr);
        }
        }

    
    }
