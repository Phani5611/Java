package Stack;

class Stack{
    int arr[];
    int size;
    int top;
    Stack(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }
    public boolean isEmpty(){
        if(top==-1) return true;
        else return false;
    }
    public boolean isFull(){
        if(size-1==top)return true;
        else return false;
    }
    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }
        else return -1;
    }
    public void push(int ele){
        if(!isFull()){
            top++;
            arr[top]=ele;
           // System.out.println("Pushed Elment"+ele);
        }
        else{
            System.out.println("Stack is full");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int returnTop=arr[top];
            top--;
            return returnTop; 
        }
        else return -1;

    }
    public int size(){
        return top+1;
    }

    public void printStackTree(){
        for(int i = 0;i<size;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class stackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);
        st.printStackTree();
        st.pop();
        st.pop();
        System.out.println(st.size());
        
       // st.push(10);
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
