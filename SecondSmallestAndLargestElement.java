import java.util.*;

// Without Sorting 

public class SecondSmallestAndLargestElement {
    static void secondmax(int arr[]){
       int max1,max2;
       max1=max2=0;
        for(int i=0;i<arr.length;i++){
         if(max1<arr[i]){
        max2=max1;
        max1=arr[i];
         }
         if(max2<arr[i] && arr[i]<max1){
            max2=arr[i];
         }
        }
        System.out.println(max2);
    }
    static void secondMin(int arr[]){
        int min1,min2;
        min1=min2=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(min1>arr[i]){
            min2=min1;
            min1=arr[i];
        }
            if(min2>arr[i] && arr[i]>min1){
                min2=arr[i];
             }
        }
        System.out.print(min2);
    }
    
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Size of the array :");
        int n = sc.nextInt();
        System.out.print("Enter the elements into  the array :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        secondmax(arr);
        secondMin(arr);
    }
}
