import java.util.*;
public class InsertionSort {
    static void printArray(int arr[]){
        System.out.print("The Sorted Elements are : ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+ " ");
        }
    }
    static void insertionSort(int arr[]){

        // Insertion Sort Technique

        for(int i=1;i<arr.length;i++)  // Unsorted Array for loop or Loop for unsorted array
        {
            int current=arr[i];
             int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n:");
            int n=sc.nextInt();
   
            int arr[]=new int[n];
            for(int z=0;z<n;z++){
                arr[z]=sc.nextInt();
            }


   insertionSort(arr);
    printArray(arr);
        }

    }
}
