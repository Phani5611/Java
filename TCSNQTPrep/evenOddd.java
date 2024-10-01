package TCSNQTPrep;

import java.util.Scanner;

public class evenOddd {
    public static int  findSum(int arr[],int n){
        int evenSum=0; int oddSum = 0;
        for(int i = 0; i< n;i++){
            if(i%2==0){
                evenSum= evenSum +arr[i];
            }
            else{
                oddSum+=arr[i];
            }
        }
        return Math.max(evenSum, oddSum);
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,1};
        int res = findSum(arr, 4);
        System.out.println(res);
    }
}
