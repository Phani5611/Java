package TCSNQTPrep;

import java.util.*;

public class ThirdLargest {
    public static int print3largest(int[] arr) {
        // Code Here
    Set<Integer> set = new HashSet<>();
    for(int i = 0 ;i<arr.length;i++){
       set.add(arr[i]);
    }
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for(int i : set){
        minHeap.add(i);
        if(minHeap.size()>3){
            minHeap.poll();
        }
    }return minHeap.peek();
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int res = print3largest(arr);
        System.out.println(res);
    }
}
