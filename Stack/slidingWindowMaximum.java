package Stack;

class FindSWM{
    public int[] findSWM(int arr[],int k){
        int n = arr.length;
        int sum[]=new int[n-k];
        for(int i = 0;i<n-k;i++){
            int max = arr[i];
            for(int j = i;j<i+k;j++){
                max = Math.max(max, arr[j]);
            }
            sum[i]=max;
        }
       return sum;
    }
}
public class slidingWindowMaximum {
    public static void main(String[] args) {
      FindSWM obj = new FindSWM();
      int arr[] ={4,0,-1,3,5,3,6,8};
     int res[]=obj.findSWM(arr, 3);
     for(int i : res){
        System.out.print(i+" ");
     }

    }
}
