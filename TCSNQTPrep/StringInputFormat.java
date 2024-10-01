package TCSNQTPrep;

import java.util.Scanner;

public class StringInputFormat {

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(right)!=s.charAt(left))return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.startsWith(" \" " ) && str.endsWith(" \" "))
{
    str = str.substring(1, str.length()-1).trim();
}        

System.out.println(isPalindrome(str));
    }
}
