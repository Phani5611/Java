package Recursion;

import java.util.Scanner;

//Using Parameters

public class printNameNTimes {
 static void print( int n){
    int count=1;
    if(count>n) 
    return;
    System.out.println("Hello");
    count++;
    print(n);    // O(N)
    
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        print(n);
    }
}