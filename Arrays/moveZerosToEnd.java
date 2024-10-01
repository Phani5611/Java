package Arrays;


import java.util.*;

public class moveZerosToEnd {
   public static int[] moverZerosToEnd(int arr[]){
     int temp []= new int[arr.length];
     for(int i=0;i<temp.length;i++){
        if(arr[i]!=0){
            temp[i]=arr[i];
        }
     }
     for(int i=0;i<temp.length;i++){
        arr[i]=temp[i];
     }
     for(int i=temp.length;i<arr.length;i++){
          arr[i]=0;
     }
     return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,2,0,2,3};
        int res[]=moverZerosToEnd(arr);
        for(int i :res){
            System.out.print(i+",");
        }
    }
}
