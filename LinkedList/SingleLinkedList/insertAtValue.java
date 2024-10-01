package LinkedList.SingleLinkedList;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class insertAtValue {
private static Node converArr2LL(int arr[]){
    Node head=new Node(arr[0]);
    Node mover=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;
}
private static Node insertAtValue(Node head,int element,int value){
    Node temp=head;
    if(head==null) {
        return null;
    }
    if(head.data==value){
        return new Node(element,head);
    }
    while(temp.next!=null){   // Not Travesing to the last element we stop at 2nd last
        if(temp.next.data==value){
         Node x = new Node(element);
         x.next=temp.next;
         temp.next=x;
         
         break;
        }
        temp=temp.next;
    }return head;
}
private static void print(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[]={10,2,4,5,6};
    Node head=converArr2LL(arr);
    head=insertAtValue(head,100,6);
    print(head);
} 
}
