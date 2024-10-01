package sortingAlgo;
import java.util.*;;
public class BubbleSort {
   static void printArray(int arr[]){
    System.out.print("The Sorted Elements are : ");  
    for (int i=0;i<arr.length;i++){   
        System.out.print(arr[i]+" ");
   }
   System.out.print(" ");
}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Size of Array : ");
            int n= sc.nextInt();
     int arr[]=new int[n];
     System.out.print(" Enter the Elements into the Array :");
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
     for(int j=0;j<n-1;j++){
            // int min=j;
      for(int k=0;k<n-j-1;k++){
            if(arr[k]>arr[k+1]){
                int temp = arr[k];                 // Swap
                arr[k]=arr[k+1];
                arr[k+1]=temp;
            }
      }
   }
   printArray(arr);
        }
    }
}
