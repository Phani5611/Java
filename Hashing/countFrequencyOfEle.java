package Hashing;

import java.util.*;
public class countFrequencyOfEle {

    private static void frequencyOfEle(int arr[], int n){
       int hash[] =new int[n+1];
       for(int i=0 ;i<n;i++){
        hash[arr[i]]++;
       }
     for(int i = 0 ; i<hash.length; i++){
        if(hash[i]>0){
            System.out.println("The element is "+i+ " and frequnecy is "+ hash[i]);
        }
     }
      }
    
    public static void main(String[] args) {
        int arr[]={2,5,2,8,5,6,8,8};
        frequencyOfEle(arr, 8);
    }
}
