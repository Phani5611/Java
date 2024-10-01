package Heaps;

import java.lang.reflect.Array;
import java.util.*;
public class TopKFrequentNumbers {

    private static ArrayList<Integer> topKElements(int arr[], int k){
        int n = arr.length; 
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer,Integer> mpp= new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        for(int i =0 ;i<n; i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet() ){
            minHeap.add(entry);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        while(!minHeap.isEmpty() ){
            res.add(minHeap.poll().getValue());
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        System.out.println(topKElements(arr,2));
    }
}
