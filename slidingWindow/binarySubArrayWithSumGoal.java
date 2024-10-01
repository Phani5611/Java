package slidingWindow;
public class binarySubArrayWithSumGoal {
    public static int lessThanOrEqualToGoal(int nums[],int goal){
        if(goal<0) return 0;
        int left = 0; int right = 0;
        int n = nums.length;
        int count = 0;int sum = 0;
        while(right<n){
            sum+=nums[right];
            while(sum>goal){
                sum=sum-nums[left];
                left++;
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {

        int res = lessThanOrEqualToGoal(nums,goal)-lessThanOrEqualToGoal(nums,goal-1);
        System.out.println(lessThanOrEqualToGoal(nums, goal));
        System.out.println(lessThanOrEqualToGoal(nums, goal-1));
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,1,1};
        System.out.println(numSubarraysWithSum(arr, 3));
    }
}
