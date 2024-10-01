package Heaps;
import java.util.*;
public class replaceRanksOfTheArray {
    private static void replaceRanksOfTheArray(int arr[], int n){
   int temp=1;
    Map<Integer,Integer> mpp = new HashMap<>();
    
     int res[] = new int[n];
     for(int i = 0; i<n ; i++){
        res[i]=arr[i];
     }
     Arrays.sort(res);
     for(int i = 0; i<n; i++){
       if(mpp.get(res[i])==null){
        mpp.put(res[i],temp);
        temp++;
       }
     
     }
     for (int i = 0; i < n; i++) {
        System.out.print(mpp.get(arr[i]) + " ");
     }
     
    }
    public static void main(String[] args) {
        int arr[]={ 2 ,20 ,10, 3 ,14 ,16, 14};
        replaceRanksOfTheArray(arr, 7);
    }
}
