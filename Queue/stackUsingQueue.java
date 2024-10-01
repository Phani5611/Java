package Queue;
import java.util.LinkedList;
import java.util.Queue;
class Stack{
    Queue<Integer> q = new LinkedList<>();

    public void push(int ele){
        int size = q.size();
        q.add(ele);
        for(int i = 1;i<size-1;i++){
            q.add(q.peek());
            q.remove();
        }
    }
    public int pop(){
        return q.remove();
    }
    public int size(){
        return q.size();
    }
    public void printStackTree(){
     while(!q.isEmpty()){
       System.out.println(q.element());
     }
    }
}
public class stackUsingQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(1);
        st.push(6);
        st.push(5);
        st.push(3);
        st.push(10);
       System.out.println(st.pop());
       

    }
}
