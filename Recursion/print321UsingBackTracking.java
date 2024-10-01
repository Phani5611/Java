package Recursion;
import java.util.*;
public class print321UsingBackTracking {
    static void print(int i,int n){
        if(i>n)
        return;
        print(i+1,n);
        System.out.println(i);
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n= sc.nextInt();
        print(i, n);



    }
}
