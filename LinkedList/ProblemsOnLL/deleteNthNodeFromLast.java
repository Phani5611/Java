package LinkedList.ProblemsOnLL;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;}
    Node(int data1){this.data=data1;this.next=null;}
}
public class deleteNthNodeFromLast {
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }return head;
    }
    private static  Node reverseLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseLL(head.next);
        Node front = head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    private static Node deleteNthNodeFromLast(Node head,int n){
        if(head==null || head.next==null)return head;
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=fast;
        return head;
       
    }
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head= convertArr2LL(arr);
        head=deleteNthNodeFromLast(head, 0);
        print(head);

    }
}
