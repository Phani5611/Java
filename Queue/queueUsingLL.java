package Queue;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueueMain{
    private Node start;
    private Node end;
    private int size;
    public QueueMain(){
        start=null;
        end=null;
        size=0;
    }
    public void push(int ele){
        Node newNode = new Node(ele);
        if(start==null){
          start=newNode;
          end=newNode;
        }
        else{
            end.next = newNode;
            end=newNode;
        }
        size++;
        System.out.println("Pushed :"+ele);
    }
    public void pop(){
        Node temp = start;
        start=start.next;
        size--;
    }
    public int size(){
     return size;
    }
    public void printQueueTree(){
        Node temp = start;
        if (temp == null) {
            System.out.println("Queue is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class queueUsingLL {
    public static void main(String[] args) {
        QueueMain q = new QueueMain();
        q.push(10);
        q.push(3);
        q.push(4);
        q.pop();
        q.printQueueTree();
        System.out.println();
       System.out.println("The size is : "+ q.size()); 
    }
}
