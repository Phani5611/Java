import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
        str1 =   str1 + str.charAt(i);
        }
        //System.out.print(str1);
        if(str.equals(str1) ){
            System.out.print("The given string is a PALINDROME");
        }
        else{
            System.out.print("The given string is NOT a PALINDROME");
        }
    } 
}