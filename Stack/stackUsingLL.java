package Stack;
class Node{
    int data;
    Node next;

   public  Node (int data){
        this.data=data;
        this.next=null;
    }
}
class StackLL{
   private Node topNode;
   public StackLL(){
    this.topNode=null;
   }
   public boolean isEmpty() {
    return topNode == null;
    }
    public void push(int ele){
       Node newNode = new Node(ele);
       Node mover = newNode;
       mover.next=topNode;
       topNode=mover;
    }
    public void pop(){
    if(isEmpty())System.out.println("Stack is empty");; 
    int ele = topNode.data;
    topNode=topNode.next;
    System.out.println("The Popped ele is :"+ele);
    }
    public void print(){
        Node temp = topNode;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class stackUsingLL {
  
    public static void main(String[] args) {
        StackLL st = new StackLL();
         st.push(10);
         st.push(20);
         st.push(5);
         st.push(8);
         st.pop();
         st.pop();
         st.print();
         
}
}