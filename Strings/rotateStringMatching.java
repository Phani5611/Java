package Strings;

import java.util.PriorityQueue;
import java.util.Queue;

public class rotateStringMatching {
     public static boolean rotateString(String s, String goal) {
        if( (s.length()==0 && goal.length()==0)) return true;
        Queue<Character> q1 = new PriorityQueue<>();  
        Queue<Character> q2 = new PriorityQueue<>();

        for(int i=0;i<s.length();i++){
            q1.add(s.charAt(i));
        }
        for(int i = 0; i<goal.length();i++){
            q2.add(goal.charAt(i));
        }

        int count = goal.length();

        while(count==0){
           char ch = q2.poll();
            q2.add(ch);
            if(q1.peek()!=q2.peek()){
          return false;
            }
          count--;
        }
        return true;
}
public static void main(String[] args) {
    String str1 = "abcde";
    String str2 = "abced";
   System.out.println(rotateString(str1,str2)); 
}
}
