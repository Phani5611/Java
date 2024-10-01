package Arrays;
import java.util.*;

import Collections_API.list;
public class unionArray {
    private static int[] union(int a[],int b[]){
       List <Integer> union = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]!=a[i+1]){
             
          union.add(a[i]);
          }
        }
        for(int i=0;i<b.length;i++){
            if(union[i]!=b[i]){
                union[i]=b[i];
            }
        }
        return union;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,4};
        int b[]={2,3,1};
        int arr[]=union(a, b);
        for(int i : arr){
            System.out.println(i);
        }
        
    }
}
