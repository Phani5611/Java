import java.util.*;
public class LargestElementTheArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the array :");
    int n = sc.nextInt();
    System.out.print("Enter the elements into  the array :");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

//     for(int j=0;j<n-1;j++){          //Bubble Sort
//      for(int k=0;k<n-j-1;k++){
//      if(arr[k]>arr[j]){
//       int temp= arr[k];
//       arr[k]=arr[j];                         //Swapping technique
//       arr[j]=temp;
// }
    //  }
    //     }
    for(int j=0;j<n-1;j++){                           // //Bubble Sort 
        // int min=j;
  for(int k=0;k<n-j-1;k++){
        if(arr[k]>arr[k+1]){
            int temp = arr[k];                 // Swap
            arr[k]=arr[k+1];
            arr[k+1]=temp;
        }
  }
}
   System.out.println("The Largest element in the array is :"+arr[n-1]); 
    
    }
}
