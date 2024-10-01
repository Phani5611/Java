package Stack;
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        char ch[]=s.toCharArray();
        int len = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<len;i++){
          if(ch[i]=='('|| ch[i]=='{' || ch[i] =='['){
            st.push(ch[i]);
          } 
          else {
            if (st.isEmpty()){return false;};
            char ele = st.pop();
            if( (ch[i]=='}' && ele=='{' ) ||  (ch[i]==')'&& ele=='(') || ( ch[i]==']' && ele=='[')){
                continue;
          }
             else{
                return false;
            }
        }
    }
    return st.isEmpty();
}
}
public class balancedParanthesis {
    public static void main(String[] args) {
    Solution obj = new Solution();
   System.out.println(obj.isValid("(){}}{")); 
    }
}
