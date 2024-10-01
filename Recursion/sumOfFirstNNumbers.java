package Recursion;

import java.util.Scanner;

public class sumOfFirstNNumbers {
    static int  print(int i,int n){
        
        if(i>n) {
             return 0 ;
        }
        return i + print(i+1,n);
       
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n= sc.nextInt();
        System.out.println(print(i, n));
    }

}
