package LinkedList.ProblemsOnLL;

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node (int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node (int data1){
        this.data=data1;
        this.next=null;
    }
}
public class add2NUmbersLL {
    private static Node convertArr1_DLL(int arr[]){
          Node head1=new Node(arr[0]);
          Node mover1=head1;
          for(int i=1;i<arr.length;i++){
            Node temp1=new Node(arr[i]);
             mover1.next=temp1;
             mover1=temp1;
          }
          return head1;
     
    }
    private static Node convertArr2_DLL(int arr2[]){
          Node head2= new Node(arr2[0]);
          Node mover2 = head2;
           for(int i=1;i<arr2.length;i++){
            Node temp2=new Node(arr2[i]);
            mover2.next=temp2;
            mover2=temp2;
          }
            return head2;
    }
    private static Node add2Numbers(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node dummyNode=new Node(-1);
        int carry=0;
        Node current =dummyNode;
        while (temp1!=null || temp2!=null) { //will traverse until either or both LL next is NULL

            int sum=carry;    // intial sum=0 so it is assigned to carry since both values are same

            if(temp1!=null) sum=sum+temp1.data; // until l1 is not null we add sum + l1.data
            if(temp2!=null) sum=sum+temp2.data; // until l2 is not null we add sum + l2.data

            Node newNode =new Node(sum%10);  // we add the sum to the new node
            carry=sum/10;

            current.next=newNode; //dummy node is pointed towards the sum list i.e newNode
            current=newNode;
            
            if(temp1.next!=null)temp1=temp1.next; // traverse to next node
            if(temp2.next!=null)temp2=temp2.next; // travese to next node
        }
        if(carry!=0){
            Node newNode = new Node(carry);
            current.next=newNode;
        }
        Node newHead=dummyNode.next;
        return newHead;
    }
    private static void print(Node head){
    Node temp=head;
    while(temp!=null){
     System.out.println(temp.data+" ");
     temp=temp.next;
    }System.out.println();
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={7,8,9,11};
        LinkedList  list = new LinkedList();
        
    }
}
