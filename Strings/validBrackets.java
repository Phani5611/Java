package Strings;

import java.util.Scanner;
import java.util.Stack;

public class validBrackets {
    private static boolean validBrackets(String str){
    char []ch =  str.toCharArray();
    Stack<Character> st = new Stack<>();
    for (char it : ch) {
        if (it == '(' || it == '[' || it == '{')
        {    st.push(it);
        }
    else{
        if(st.isEmpty())return false;
        char ele=st.pop();

        if((ele=='(' && it==')') || (ele=='{' && it=='}') ||(ele=='[' && it==']')){
            continue;
        }
        else 
        {
            return false;
        }
    }
}
    if(st.isEmpty()){
        return true;
    }
    return false;
}
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the String :");
 String str = sc.nextLine();
 System.out.println(validBrackets(str));
}
}