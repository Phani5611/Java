package slidingWindow;

import java.util.*;

public class subArrayWithKDifferentIntegers {

    private static int bruteForce(int arr[], int k){
        int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        int count = 0;
        for(int i = 0; i<n ; i++){
            for(int j = i ; j<n ; j++){
                mpp.put(arr[j],i);
                if(mpp.size()<=k){
                    count =count + 1;
                }
                if(mpp.size()>k){
                    mpp.clear();
                    break;
                }
            }
        }return count;
    }

    // Optimal Approach
    private static int optimalApproach(int arr[], int k ){
        Map<Integer,Integer> mpp = new HashMap<>();
        int n = arr.length; int count = 0;
        int left = 0 ; int right = 0;
        while(right<n){
            if(mpp.size()<=k){
                   mpp.put(arr[right], mpp.getOrDefault(arr[right], 0)+1); 
            }
            while(mpp.size()>k){
                mpp.put(arr[left], mpp.get(arr[left])-1);
                if(mpp.get(arr[left])==0)mpp.remove(arr[left]);
                left++;
            } count = count + ( right - left + 1);
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,2,3};
        int res = optimalApproach(arr, 2)-optimalApproach(arr, 1);
        System.out.println(res);
    }
}
