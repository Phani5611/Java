package Stack;
import java.util.Stack;
class Stackk{
   public char[] reverse(char arr[],int start,int end){
     while(start<end){
       char temp = arr[start];
       arr[start] = arr[end];
       arr[end]=temp;
       start++;
       end--;
     }return arr;
   }
    public static int priority(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
            return 2;

            case '^':
            return 3;

            default:
                return -1;
        }
    }
    public String InfixToPrefix(String s){
       Stack<Character> st = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int len = s.length();
        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        //reverse array of char's of the given string
        reverse(ch,start,end);
       // System.out.println(ch);
        for(int i = 0 ;i<len;i++){ 
        // System.out.println(ch[i]);
            if(ch[i]==')')st.push(ch[i]);
            else if( (ch[i]>='A' && ch[i]<='Z')||
                     (ch[i]>='a' && ch[i]<='z')||
                     (ch[i]>='0' && ch[i]<='9')) sb.append(ch[i]);
            else if(ch[i]=='('){
                while(!st.isEmpty() && st.peek()!=')'){
                    sb.append(st.pop());
                }
                st.pop();
            }

            // Here we handle the operators
            else{
                // if(st.isEmpty() || priority(ch[i])>=st.peek() || st.peek()==')'){
                //     st.push(ch[i]);
                // }
                // else{
                //     while(priority(ch[i])>=st.peek()!=true){
                //             sb.append(st.pop());
                //     }
                //     st.push(ch[i]);
                // }
                // }
                while(!st.isEmpty() && priority(ch[i])<priority(st.peek())){
                         sb.append(st.pop());
                    }
                    st.push(ch[i]);
                }
            }
        
            while (!st.isEmpty()) {
                sb.append(st.pop());
            }
            
         return sb.reverse().toString();
    } 
}
public class InfixToPrefix {
    public static void main(String[] args) {
    Stackk obj = new Stackk();
   System.out.println(obj.InfixToPrefix("(A+B)*C-D+F")); 

    }
}
