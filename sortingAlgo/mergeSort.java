package sortingAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergeSort {
  private static void mergeSort(int arr[],int low,int high){
      if(low>=high)return;
      int mid=(low+high)/2;
      mergeSort(arr, low, mid); // first Half
      mergeSort(arr, mid+1, high);//Second Half
      merge(arr, low,mid,high); // merging the half's
    }
    // merging the half's function 
   private static  void merge(int arr[],int low,int mid,int high){
    // Storing the new compared elements into the new Array list
    ArrayList<Integer> temp=new ArrayList<>();
     int left=low;
     int right=mid+1;
     while(left<=mid&&right<=high){
        if(arr[left]<=arr[right]){
            temp.add(left);
            left++;
        }
        else{
            temp.add(right);
            right++;
        }
     }
     //if any of the half becomes exhausted while traversing or comparing
     // we add the remaining elements into the 'temp'
     while(left<=mid){
        temp.add(left);
        left++;
     }
     while (right<=high) {  
        temp.add(right);
        right++;
     }
    //  copying the 'temp' elements into the original array
     for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);
     }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
