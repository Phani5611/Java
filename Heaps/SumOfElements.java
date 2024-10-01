package Heaps;

import java.util.*;
public class SumOfElements {
    private static int sumOfElements(int arr[], int k){
        int n = arr.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ;i<n;i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
        }
    public static void main(String[] args) {
        int arr[]={1,3,12,5,15,11}; int sum = 0;
        int first = sumOfElements(arr, 3);
        int second = sumOfElements(arr, 6);
        for(int i = 0 ; i<arr.length ; i++){
           if(arr[i]>first && arr[i]<second){
            sum = sum + arr[i];
           }
        }
        System.out.println(sum);
    }
}
