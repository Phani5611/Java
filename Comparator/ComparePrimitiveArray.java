package Comparator;
import java.util.*;

import sortingAlgo.solution;
public class ComparePrimitiveArray {

    //Lambda Expression
//     public static Comparator<int[]> getComparator(){
//        return (a,b)->Integer.compare(a[1],b[1]);
//    }

   //Using Separate Class
    public static class EndTimeComparator implements Comparator<int[]> { 
        public int compare(int[] a, int[] b) {
            if(a[1]>b[1])return 1;
            else return -1; // Compare based on the second element (end time)
        }
    }
    public static int[][] coverting1DTo2DArray(int start[],int end[], int n){
        int[][] meetings=new int [n][2];
        for(int i = 0; i<n;i++){
            meetings[i][0]=start[i];
            meetings[i][1]=end[i];
        }
        Arrays.sort(meetings,new EndTimeComparator());
        return meetings;
    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int arr[][]=coverting1DTo2DArray(start, end, 6);
        for(int i[] : arr){
            for(int j :i){
                System.out.print(j+" ");
            }
            System.out.println(); 
        }         
    }
}
