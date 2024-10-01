package LinkedList.SingleLinkedList;
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data= data1;
        this.next=next1;
    }
    Node(int data1){
        this.data= data1;
        this.next=null;
    }
    }

public class insertingInLL {
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
          Node temp = new Node(arr[i]);
          mover.next= temp;
          mover=temp;
        }
        return head;
    }
    private static Node insertELement( Node head, int element){
       // return new Node(element,head);
       Node temp = head;
       while(temp.next!=null){
        temp=temp.next;
        }
        Node newNode = new Node(element);
        temp.next = newNode;
        return head;
       }
    private static void print(Node head){
        Node temp=head;
        System.out.print("The LinkeList elements are :");
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
    }
}
    public static void main(String[] args) {
        int arr[]={10,2,3,4,5};
        Node head = convertArr2LL(arr);
        head=insertELement(head, 100);
        print(head);
        }
}
    
