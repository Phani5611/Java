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
  public  Node convertArr2LL(int arr[]){
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover = temp;
    }
    return head;
  }
  public Node deleteHead( Node head){
    if(head==null)
    return head;
    else{
    head=head.next;
    return head;
   }
  }
  public  void print(Node head){
    Node temp=head;
      while (temp!=null) {
            System.out.println(temp.data +" ");
            temp= temp.next;
        }
        System.out.println("The New Head Node Is :"+" "+ head.data);
  }
}
public class deleteHeadInLL {
  
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        LinkedList obj  = new LinkedList();
        Node head = obj.convertArr2LL(arr);
        head = obj.deleteHead(head);
        obj.print(head);
      
    }
   

}
