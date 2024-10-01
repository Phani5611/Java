package TCSNQTPrep;
import java.security.KeyStore.Entry;
import java.util.*;
class Solution{
    public int findSumOfUniqueElements(int arr[])
    { Map<Integer,Integer> mpp = new HashMap<>();
    for(int i = 0 ;i<arr.length;i++){
    mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
    }
    int i = 0 ; int sum = 0;
   for(int key : mpp.keySet())
   if (mpp.get(key) == 1) {
    sum += key;
    i++;
    }
    return sum;
    }
    }
    public class FindSumOfUniqueElements{
    public static void main(String args[]){
    Solution obj = new Solution();
    Scanner sc  = new Scanner (System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements into array :");
    for(int i = 0 ;i<n;i++){
    arr[i]=sc.nextInt();
    }
    
    int res = obj.findSumOfUniqueElements(arr);
    System.out.print(res);
    }
    }
    
    