package Recursion;
import java.util.*;
public class Factorial {
    static int print(int n){
        if(n==0)
        return 1;
        else
         {return ( n * print(n-1));}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
