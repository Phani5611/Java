package Arrays;

public class RotateArrayByKPlaces {
    private static int[] rotateArrayByKPlaces(int arr[], int k){
        int temp[]=new int[k];
        int n = arr.length;
       int right = n-1;
       int left = 0;
       while(left<k){
        temp[left]=arr[right];
        left++;
        right--;
    }
        int j = 0;
        for(int i = 0; i<n ; i++){
        }
        return arr;
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int res[]=rotateArrayByKPlaces(arr, 3);
    for(int i : res)
    System.out.print(i + " ");
}

}
