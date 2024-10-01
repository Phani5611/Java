package sortingAlgo;
import java.lang.reflect.Array;
import java.util.*;
public class quickSort {
   private static void swap(int i,int j){
    int temp = 0;
    temp=i;
    i=j;
    j=temp;
   }
    private static void qs(List<Integer> arr,int low,int high){
        if(low<high){
         int partionIndex = partion( arr, low, high);
         qs(arr, low, partionIndex-1);
         qs(arr, partionIndex+1, high);
        }
    }
    private static int partion(List<Integer> arr,int low, int high){
    int pivot=low;
     int i=low;
     int j=high;
     while(i<j){
        while(arr.get(i)<=arr.get(pivot)&& i<=high){
            i++;
        }
        while(arr.get(j)>arr.get(pivot)&& j>=low){
            j--;
        }
        if(i<j){
           Collections.swap(arr,i,j);
        }
     }
    Collections.swap(arr, pivot, j);
     return j;
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here.
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
    public static void main(String[] args) {
       List<Integer> arr=new ArrayList<>();
       arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
       int n = arr.size();
       arr = quickSort(arr);
       System.out.println("After  sort: ");
       for (int i = 0; i < n; i++) {
           System.out.print(arr.get(i) + " ");
       }
       System.out.println();
        }
        }

