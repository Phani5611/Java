package Arrays;
import java.util.*;
import java.math.*;;
public class longestSubArray {
    private static int longestSubArray(int arr[], int k){
        int n = arr.length;
        int len = 0;
       
        for(int i=0;i<n;i++){
            int sum =0;
         for(int j = i;j<n;j++){
                sum=sum+arr[j];
            if(sum==k){
                len=Math.max(len, j-i+1);
            } 
            }
            }
            return len;
        }
    public static void main(String[] args) {
        int arr[] ={1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        int res = longestSubArray(arr, k);
        System.out.println(res);
    }
}
