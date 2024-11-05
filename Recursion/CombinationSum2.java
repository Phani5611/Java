package Recursion;
import java.util.List;
import java.util.Set;
import java.util.*;
public class CombinationSum2 {
    public static void findAllCombination(int index, int target,int nums[],ArrayList<Integer> ds, List<List<Integer>>result){
     if(index == nums.length){
        if (target==0) {
           result.add(new ArrayList<>(ds)); 
        }
        return;
     }
     if(nums[index]<=target){
        ds.add(nums[index]);
        findAllCombination(+index+1, target-nums[index], nums, ds,result);
        ds.remove(ds.size()-1);
     }
     findAllCombination(index+1, target, nums, ds,result);
    }
    public static void main(String[] args) {
     int nums[]={10,1,2,7,6,1,5};
     int target = 4, index = 0;
     List<List<Integer>> result = new ArrayList<>();
     Set<Set<Integer>> set = new HashSet<>(result);
    findAllCombination(index, target, nums, new ArrayList<>(),result);
    System.out.println(result);
    }
}
