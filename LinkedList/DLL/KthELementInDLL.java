package LinkedList.DLL;
class Node{
    int data;
    Node next;
    Node back;
  
    Node(int data1,Node next1,Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }

}

public class KthELementInDLL {
    private static Node convertArr2DLL(int arr[]){
    Node head=new Node(arr[0]);
    Node prev=head;
    for(int i=1;i<arr.length;i++){
        Node temp = new Node(arr[i]);
        prev.next=temp;
        temp.back=prev;
        prev=temp;
        }
        return head;
    }
    private static Node deleteKthElement(Node head,int k){
   
     int count =0;
     Node temp=head;
     while(temp!=null){
        count++;
       if(count==k) break;
       temp=temp.next;
     }
     Node prev=temp.back;
     Node front=temp.next;
    if(prev==null && front==null){
        return null;
    }
    else if(prev==null){ 
        prev=head;
        head=head.next;         // Deleteion Of Head Node
        head.back=null;
        prev.next=null;
        return head;
    }
    else if(front==null){
        prev.next=null;
        temp.back=null;      // deletion of tail
        return head;
    }
    else{
        prev.next=front;
        front.back=prev;
        temp.next=null;     // deletion at Kth Element
        temp.back=null;
        return head;
    }

}
private static void print(Node head){
    Node temp=head;
    while (temp!=null) {
        System.out.println(temp.data+" ");
        temp=temp.next;
    }System.out.println();
}
    public static void main(String[] args) {
    int arr[]={1,10,3,45,15};
    Node head = convertArr2DLL(arr);
    head=deleteKthElement(head,2 );
    print(head);
    }
     
}
