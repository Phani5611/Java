package Stack;
import java.util.Stack;
class Solution {
    public int[] find_nge(int arr[]){
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
        int NGE[]=new int[n];
        
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            NGE[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return NGE;
    }
    public int[] find_pge(int arr[]){
        Stack <Integer> st = new Stack<>();
        int  n = arr.length;
        int PGE[]=new int[n];
        for(int i = 0; i<n ;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            PGE[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return PGE;
    }
    public int[] find_pse(int nums[]){
        int pse[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i< nums.length;i++){
             while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
             }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }
    public int[] find_nse(int nums[]){
        int nse[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i = nums.length-1;i>=0;i--){
             while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
             }
            nse[i]=st.isEmpty()?nums.length:st.peek();
            st.push(i);
        }
        return nse;
    }
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum_mini = 0;
        long  sum_max = 0;
        int nge[]=find_nge(nums);
        int pge[]=find_pge(nums);
        int pse[]=find_pse(nums);
        int nse[]= find_nse(nums);
        for(int i =0 ;i<n;i++){
            //Finding Sum of subarray  MINIMUM
            int left_SubArray_mini = i - pse[i];
            int right_SubArray_mini = nse[i]-i;
            sum_mini = (sum_mini + (long) left_SubArray_mini * right_SubArray_mini * nums[i]) ;

           //Finding Sum of subarray MAXIMUM
            int left_SubArray_max = i - pge[i];
            int right_SubArray_max = nge[i]-i;
             sum_max = (sum_max + (long) left_SubArray_max * right_SubArray_max * nums[i]);
        }
        long res =(sum_max - sum_mini);
        return res;
    }
}
public class SumofSubArrayRanges{
    public static void main(String[] args) {
    Solution obj = new Solution();
    int arr[] = {1,2,3};
    System.out.println(obj.subArrayRanges(arr));
    }
}