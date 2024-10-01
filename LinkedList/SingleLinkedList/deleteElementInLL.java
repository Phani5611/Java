package LinkedList.SingleLinkedList;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
       this.data=data1;
       this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }

}
class LinkedList{

    //Creating A LL

    public Node converArr2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    // Node Deletion
    
    public  Node  deleteElement(Node head,int element){
        if(head==null)return head;
        if(head.data==element){
          head=head.next;
          return head;
        }
        Node temp =head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==element){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }return head;
    }
    public  void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("the new head node is:"+head.data);
    }
}
    
public class deleteElementInLL {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        LinkedList obj = new LinkedList();
        Node head=obj.converArr2LL(arr);
        head=obj.deleteElement(head, 2);
        obj.print(head);
    }
}
