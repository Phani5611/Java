package Recursion;

import java.util.*;
import java.util.List;

public class PrintingSubSequnceSumK {
   public static  void findSubSequenceSumK(int index,int nums[],int k,ArrayList<Integer> current, List<List<Integer>> result ){
   int sum = 0;
    if(index>=nums.length){ 
    if( sum==k){
        result.add(new ArrayList<>(current));
        return;
    }}
    current.add(nums[index]);
    sum=sum+nums[index];
    findSubSequenceSumK(index+1, nums, k, current, result);
    current.remove(current.size()-1);
    sum=sum-nums[index];
    findSubSequenceSumK(index+1, nums, k, current, result);
   }
   public static List<List<Integer>> subSet(int nums[]){
    List<List<Integer>> result = new ArrayList<>();
      findSubSequenceSumK(0,nums,2,new ArrayList<>(),result );
      return result;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str =sc.nextLine();
    if(str.startsWith("[")&& str.endsWith("]")){
        str=str.substring(1,str.length()-1);
    }
    String arr[]=str.split(",");
    int intArr[]=new int[arr.length];
    try{
        for(int i =0;i<arr.length;i++){
           intArr[i]=Integer.parseInt(arr[i].trim());
           //System.out.print(intArr[i]);
        }
        
    }
    catch(Exception e){
     System.out.println("Invalid Format");
     
    }
    
    List<List<Integer>> result= subSet(intArr);
    System.out.println(result);
   } 
}
