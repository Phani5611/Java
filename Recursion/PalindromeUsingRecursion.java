package Recursion;

import java.util.Scanner;
import java.util.*;
public class PalindromeUsingRecursion {
    public static boolean isPalindrome(int i,char str[]) {
        if(i>=str.length/2)return true;
        if(str[i]!=str[str.length-i-1])
        return false;
        return isPalindrome(i+1,str);  
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char str[]=new char[s.length()];
        for(int j=0;j<s.length();j++){
         str[j]=s.charAt(j);
        }
       System.out.println( isPalindrome(0,str));
    }
}
