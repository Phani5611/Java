package LinkedList.SingleLinkedList;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node( int data1){
        this.data=data1;
        this.next=null;
    }
}

public class insertTailLL {
    private static Node convertArr2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
          Node temp= new Node(arr[i]);
          mover.next=temp;
          mover=temp;
        }
        return head;
    }
    private static Node insertTail( Node head , int val){
        if(head==null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;      // Traversal
        }
        Node newNode= new Node(val);
        temp.next=newNode;
        return head;
    }
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=convertArr2LL(arr);
        head=insertTail(head, 220);
        print(head);

    }
}
