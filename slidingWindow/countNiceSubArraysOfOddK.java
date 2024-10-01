package slidingWindow;
//CountNice Sub Arrays
public class countNiceSubArraysOfOddK {
    public static int niceSubArrays(int arr[], int k){
        int n = arr.length;
        int count = 0;
        for(int i =0 ;i<arr.length;i++){
            int odd=0;
            for(int j = i; j<arr.length;j++){
            if(arr[j]%2==1){
                odd++;
            }
            if(odd<=k){
                count++;
            }
            else{
                odd = odd - arr[i];
                break;
            }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={ 2,2,2,1,2,2,1,2,2,2};
        int res = niceSubArrays(arr, 2)-niceSubArrays(arr, 1);
        System.out.println(res);
    }
}
