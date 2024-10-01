package Arrays;
import java.util.*;
public class buyAndSellStock {
    private static int maxProfit(int arr[]){
        int n = arr.length;
        int maxProf = 0;
        // for(int i = 0;i<n;i++){
        //     for(int j =i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             int diff = arr[j]-arr[i];
        //              if(diff > maxProf){
        //             maxProf=diff;
        //             }
        //         }
        //     }
        // }
        int min = arr[0];
        for(int i =1; i< n ; i++){
            int cost  = arr[i]-min;
            if(cost>maxProf){ 
                maxProf = cost;
            }
            min = min(min,arr[i]);
        }
            return maxProf;
        }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int result = maxProfit(arr);
        System.out.println(result);
    }
}
