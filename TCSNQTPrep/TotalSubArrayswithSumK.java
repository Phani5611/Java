package TCSNQTPrep;

// class Solution{
//     public int findTotalSubArrayWithSumK(int arr[], int k){
//         int n = arr.length;
//         int left = 0 ; int right = 0;
//         int count = 0; int sum = 0;
//         while(right<n){
//             sum = sum+arr[right];
//             if(sum==k){
//                 count++;
//             }
//             if(sum>k){
//                 sum=sum-arr[left];
//                 left++;
//             }
//             right++;
//         }
//         return count;
//     }
// }
public class TotalSubArrayswithSumK {
    private static int findTotalSubArrayWithSumK(int arr[],int k){
        int n = arr.length;
        int left = 0 ; int right = 0;
        int count = 0; int sum = 0;
        while(right<n){
            sum = sum+arr[right];
            while(sum>k){
                sum=sum-arr[left];
                left++;
            }
            count=count+(right-left+1);
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1};
        int res = findTotalSubArrayWithSumK(arr, 3)-findTotalSubArrayWithSumK(arr, 2);
        System.out.println(res);
        
}
        // Solution obj = new Solution();
        // int res = obj.findTotalSubArrayWithSumK(arr, 3);
        //System.out.println(res);
}
