
import java.util.*;
public class twoSum {

    public static  int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++)
             if(nums[i]+nums[j] == target){
                result[0]=i;
                result[1]=j;
                break;
        }
    }
        return result;
}
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        int target = sc.nextInt();
        for(int i= 0; i<nums.length;i++){
          nums[i]=sc.nextInt();
        }
    twoSum(nums,target);
    }

    
}
