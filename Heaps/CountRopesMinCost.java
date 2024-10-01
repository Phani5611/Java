package Heaps;

import java.util.*;
public class CountRopesMinCost{

    private static int minCost(int arr[]){
        int n = arr.length; int sum =0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0 ;i<n ;i++){
            minHeap.add(arr[i]);
        }
        while(minHeap.size()>=2){
            int poll1 = minHeap.poll();
            int poll2 = minHeap.poll();
            int poll3 = poll1 + poll2;
            sum = sum+poll3;
            minHeap.add(poll3);       
    }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(minCost(arr));
    } 
}