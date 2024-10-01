package Recursion;
import java.util.*;
public class palindromeRecursionLeetCode {
        public static boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            char strArr[] = new char[s.length()];
            for(int i=0;i<s.length();i++){
                strArr[i]=s.charAt(i);
            } 
            int l=0;
            if (strArr==null) {
                return true;}
            if(l>=s.length()/2)return true;
            if(strArr[l]!=strArr[strArr.length-1])
                return false;
            else
            return isPalindrome(s.substring(l+1,strArr.length-1));
            
        }
        public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              String s = "";
              System.out.print(isPalindrome(s));
          
        }
    
    }

