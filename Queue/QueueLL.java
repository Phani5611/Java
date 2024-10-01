package Queue;
public class QueueLL{
    private Node start;
    private Node end;
    private int size;
    public QueueLL(){
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