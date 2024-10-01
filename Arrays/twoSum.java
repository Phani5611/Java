

public class twoSum {
    private static int[] twoSum1(int arr[],int target){
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j =1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans ;
                }
            }  
        } 
      return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int  target =14;
        int res []= twoSum1(arr, target);
        System.out.println(res[0]+ " "+res[1]);
        }
       
}
