package Heaps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class sortKSortedArrays {
    private static ArrayList sortKSortedArrays(int arr[], int k){
        ArrayList <Integer> list = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0 ; i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
              list.add(minHeap.poll());
            }
        }
        while (!minHeap.isEmpty()) {
            list.add(minHeap.poll());
        }
        return list;
    }
    
    public static void main(String[] args) {
      int arrr[] = {6,5,3,2,8,10,9};
      System.out.println(sortKSortedArrays(arrr, 3));
    }
}
