package Recursion;
import java.util.Scanner;
public class reverseAnArray {
    static void swap( int l, int r, int arr[]){
        int temp = arr[l];
        arr[l]=arr[r];                  //Swap
       arr[r]=temp;
    }

 static void printArr(int l,int r,int arr[]){
        if(l>=r)
        return;
        swap(l, r-1, arr);
        printArr(l+1, r-1,arr);

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements into the array :");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printArr(0,n,arr);
      for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
    }
}