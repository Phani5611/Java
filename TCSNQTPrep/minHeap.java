package TCSNQTPrep;

import java.lang.reflect.InaccessibleObjectException;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

import lambdaExpression.lambdaExpression;

public class minHeap {
    public static int findCost(ArrayList<Integer> arr){
        int sum =0 ; int cost=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 

        for(int i : arr){
            minHeap.add(i);
        }
       // System.out.println(maxHeap);
        while(minHeap.isEmpty(){
            int poll1 = minHeap.poll();
            int poll2 = minHeap.poll();
            sum = poll1 + poll2;
            cost = cost + sum;
            minHeap.add(sum);
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        
      int res = findCost(list);
      System.out.println(res);
    }

}
