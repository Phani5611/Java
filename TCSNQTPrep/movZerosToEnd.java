package TCSNQTPrep;
import java.util.*;
public class movZerosToEnd {
    private static int[] moveZeroToEnd(int arr[])
    {
        int n = arr.length; 
        int temp[]=new int[n];
        for(int i = 0;i<n;i++){
        if(arr[i]!=0) temp[i]=arr[i];}
            
        for(int i=0;i<n;i++)
        { arr[i] = temp[i];}

        for(int i =temp.length; i<n ;i++){
        arr[i]=0;
        }
        return arr;
    }
    public static void main(String args[]){
    int arr[]={1,2,0,1,0,1,1};
    int res[]=moveZeroToEnd(arr);
    for(int i : res){
        System.out.print(i);
    }
    
    }
}
