package TCSNQTPrep;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumber {
    private static int missingNumber(int arr[]){
        int n = arr.length;
        int hash[] = new int[n+1];
        int missing = -1;
        for(int  i =0 ;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i = 0 ;i<hash.length;i++){
            if(hash[i]==0){
             missing=i;
            }
        }
        return missing;
    }
    public static int missingNumber2(int[] nums) {
        int n = nums.length; int missing=-1;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                int temp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        //if input is comma separated i.e 1,2,3,4,5
        // ArrayList<Integer> arr = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        // Scanner ss = new Scanner(input).useDelimiter(",");
        // while (ss.hasNextInt()) {
        //     arr.add(ss.nextInt());
        // }
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        System.out.println("Enter elements into the array :");
        int arr[]=new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int res[]=missingNumber2(arr);
        // for(int i : res){
        //     System.out.println(i);
        // }
        System.out.println(missingNumber2(arr));
    }
}
