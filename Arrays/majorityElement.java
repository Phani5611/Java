package Arrays;
import java.util.*;
public class majorityElement {
    private static int majorityElement(int arr[]){
        int  n = arr.length;
        // Brute Force
        // int count =0;
        // for(int i = 0;i<n;i++){
        //     int mele= arr[i];
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]==mele){
        //             count++;
        //         }
        //     }
        //     if(count>n/2){
        //         return mele;
        //     }
        // }

        //Better Approach
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }
        Iterator <Entry<Integer,Integer>> it  = mpp.EntrySet().iterator();
        if (it.getValue() > (n / 2)) {
            return it.getKey();
        }
        }
         return 0;
     }
     public static void main(String[] args) {
         int arr[]={2, 2, 2, 3, 2, 1,3, 2, 1};
         int result = majorityElement(arr);
         System.out.print(result);
     }
}
