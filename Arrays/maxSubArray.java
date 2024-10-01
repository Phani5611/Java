package Arrays;
import java.util.*;
public class maxSubArray {
    private static int maxSunArrray(int arr[]){
     int n = arr.length;
     int max = Integer.MIN_VALUE;
     int sum =0;
     int ansStart =-1;
     int start=-1;
     int ansEnd =-1;
     for(int i =0;i<n;i++){
        if(sum==0){ start =i;}
        sum+=arr[i];
        if(sum>max){
            max=sum;
            ansStart=start;
            ansEnd=i;
        }
        if(sum<0){
            sum = 0;
        }
     }
     System.out.println("The Sub Array is :");
     for(int i =ansStart;i<=ansEnd;i++){
      System.out.print(arr[i] + " ");
     }
     return -1;
    }
    public static void main(String[] args) {
        int arr[]={-2,-2,4,-1,-2,1,5,-3};
        maxSunArrray(arr);

    }
}
