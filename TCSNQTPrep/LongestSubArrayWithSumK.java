package TCSNQTPrep;

import java.util.Scanner;

class Solution {
    // Function for finding maximum and value pair
    public  int findLongSubArrayWithKSum(int A[], int N, int K) {
        // Complete the function
        int left = 0 ; int right = 0;
        int sum = 0; int max_len=0;
        while(right<N){
            sum = sum + A[right];
            if(sum>K){
                sum = sum - A[left];
                left++;
            }
            int len = right-left+1;
            max_len = Math.max(len,max_len);
            right++;
        }
        return max_len;
    }
}
public class LongestSubArrayWithSumK {
    private static  int findLongSubArrayWithKSum(int A[], int N, int K) {
        // Complete the function
        int left = 0 ; int right = 0;
        int sum = 0; int max_len=0; 
        while(right<N){
            sum = sum + A[right];
            while(sum>K){
                sum = sum - A[left];
                left++;
            }
            int len = right-left+1;
            max_len = Math.max(len,max_len);
            right++;
        }
        return max_len;
    }
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements into the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        
        Solution obj = new Solution();
        System.out.println(findLongSubArrayWithKSum(arr, n, k));
        
}
    
}
