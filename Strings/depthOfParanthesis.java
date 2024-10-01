package Strings;

import java.util.Scanner;
import java.util.Stack;

public class depthOfParanthesis {
    private static int depthOfParanthesis(String str){
        // Write your code here.
        char []ch = str.toCharArray();
        int count = 0;
        Stack<Character> st = new Stack<>();
        while(ch!=')'){
            if(it=='('){
                st.push(it);
                count=count+1;
            }  
        else{
            //if(st.isEmpty()){return count;}
            char ele= st.pop();
            if(ele=='(' && ch==')')
            {
              break;
            }
            else{
                return -1;
            }
        }
        }
        if(st.isEmpty()){
        return count;
        }
        return -2;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(depthOfParanthesis(str));
   } 
}
