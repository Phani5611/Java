<<<<<<< HEAD
import java.util.*;
public class SortedArrayChecking {
    private static boolean arrayCheck;
    /**
     * @param arr
     * @return
     */
    static boolean arrayCheck(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
             return false;
            }
            // else{
            //     return true;
            // }
        }
    return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(arrayCheck(arr)); 
    }

    // static boolean isSorted(int arr[], int n) {
    //     for (int i = 1; i < n; i++) {
    //       if (arr[i] < arr[i - 1])
    //         return false;
    //     }
    
    //     return true;
    //   }
    
    //   public static void main(String args[]) {
    //     int arr[] = {1, 2, 3, 5,4 }, n = 5;
    
    //     System.out.println(isSorted(arr, n));
    //   }
}
=======
import java.util.*;
public class SortedArrayChecking {
    private static boolean arrayCheck;
    /**
     * @param arr
     * @return
     */
    static boolean arrayCheck(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
             return false;
            }
            // else{
            //     return true;
            // }
        }
    return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(arrayCheck(arr)); 
    }

    // static boolean isSorted(int arr[], int n) {
    //     for (int i = 1; i < n; i++) {
    //       if (arr[i] < arr[i - 1])
    //         return false;
    //     }
    
    //     return true;
    //   }
    
    //   public static void main(String args[]) {
    //     int arr[] = {1, 2, 3, 5,4 }, n = 5;
    
    //     System.out.println(isSorted(arr, n));
    //   }
}
>>>>>>> d10b71e12078f9e13f955cb0b520a7aa0a52bf82
