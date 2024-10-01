import java.util.*;
public class largestElement {  
     static void largestElement(int arr1[]){
          int largest=arr1[0];
          for(int i=0;i<arr1.length;i++){ 
              if(arr1[i]>largest){
                largest=arr1[i];
              }
             
          }
          System.out.println(largest);
     }                                                      // Max length of array  --> 1. Inside Main Block 10^6 ( Locally )
                                                           //                          2.  Globally 10^7
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array :");
    int n=sc.nextInt();
    System.out.println("enter the elements into the array :");
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    largestElement(arr);
    }
}
