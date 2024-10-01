package LinkedList.SingleLinkedList;
class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node (int data1){
        this.data=data1;
        this.next=null;
    }
}
public class insertAtKthElement {
    private static Node converArr2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover = head;
        for(int  i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static Node insertAtKthElement(Node head,int ielement,int k){
        if(head==null){
            if(k==1)return new Node(ielement);
        }
         if(k==1){
            Node newHead = new Node(ielement,head);
            return newHead;
         }
         int count=0;
         Node temp = head;
         while(temp!=null){
            count ++;
            if(count==(k-1)){
             Node newNode = new Node(ielement);
             newNode.next=temp.next;
             temp.next=newNode;
             break;
            }
            temp=temp.next;
        }
        
        return head;
    }
   private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,2,40,5,1};
        Node head=converArr2LL(arr);
        head=insertAtKthElement(head, 20, 5);
        print(head);
    }
}
