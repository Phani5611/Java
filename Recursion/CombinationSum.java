package Recursion;
import java.util.List;
import java.util.ArrayList;
public class CombinationSum {
    public static void findAllCombination(int index, int target,int sum,int arr[], ArrayList<Integer> ds,List<List<Integer>> result){
       int n = arr.length;
        //Base Condition
        if(index==n){
            if(target==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[index]<=target){
            
            ds.add(arr[index]);
            findAllCombination(index, target-arr[index], sum, arr, ds, result);
            ds.remove(ds.size()-1);
        }
            findAllCombination(index+1, target, sum, arr, ds, result);
        
  

    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int sum = 0, index=0;
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        findAllCombination(index, target, sum, arr, new ArrayList<>(), result);
        System.out.println( result );
    
    }
}
