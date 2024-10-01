package sortingAlgo;
public class selection {
    private static void swap(int arr[],int i,int j){
        if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
            // Perform the swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.println("Invalid indices. Please provide valid indices within the array bounds.");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,3};
        for(int i=0;i<=arr.length-2;i++){   // This loop is for swapping
            int min=i;  
            for(int j=i;j<=arr.length-1;j++){
              if(arr[j]<arr[min])            // This Loop is for finding minimum in array
              min=j;
            }
            swap(arr, min, i);
        }
        for(int x : arr)
        System.out.println(x);
    }
}
