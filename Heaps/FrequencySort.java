package Heaps;

import java.util.*;
public class FrequencySort {
    private static int[] frequencySort(int arr[]){
        int n  = arr.length;
        int sortedArray[] =new int[n];

        Map<Integer,Integer> mpp = new HashMap<>();

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ? Integer.compare(b.getKey(), a.getKey()) : Integer.compare(b.getValue(), a.getValue()));

        //Adding frequencies to map
        for(int i = 0 ;i<n ;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }

        //Adding All the map to priority Queue
        maxHeap.addAll(mpp.entrySet());

        // sorting and printing the frquency of elements
        int index = 0;
        while(!maxHeap.isEmpty()){
            int ele = maxHeap.peek().getKey();
            int freq  = maxHeap.peek().getValue();
            for(int i = 0 ;i<freq;i++){
              sortedArray[index++]=ele;
            }
            maxHeap.poll();
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int arr[]={2,5,2,8,5,6,8,8};
        int res[]=frequencySort(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
