package Recursion;

import java.util.*;
public class printingAllSubSequence {
 public static void findSubSequence(int index, List<Integer> current,List<List<Integer>> list,int nums[]){
    if(index>=nums.length){
        list.add(new ArrayList<>(current));
        return;
    }
    current.add(nums[index]);
    findSubSequence(index+1, current, list, nums);
    current.remove(current.size()-1);
    findSubSequence(index+1, current, list, nums);
 } 
  public static List<List<Integer>> subSets(int nums[]){
    int index = 0;
    List<List<Integer>> list = new ArrayList<>();
    findSubSequence(index,new ArrayList<>(),list,nums);
    return list;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if(str.charAt(0)=='[' && str.charAt(str.length()-1)==']'){
        str=str.substring(1, str.length()-1);
    }
    String arr[] =str.split(",");
    int list[]=new int[arr.length];
    for(int i = 0 ;i<arr.length;i++){
    try{
        list[i]=Integer.parseInt(arr[i].trim());
    }
    catch(NumberFormatException e){
        System.out.println("Invalid Number format");
    }
       
    }
    List<List<Integer>> result = subSets(list);
    System.out.println(result);


  }
}
