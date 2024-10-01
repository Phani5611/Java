package LinkedList.SingleLinkedList;


// Index value Deletion
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
public class deleteKthElement {
     private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static Node deleteK(Node head, int val){
        if(head==null|| val==1)return head;
        Node temp=head;
        int count=0;
        Node prev=null;
        
            while(temp!=null){
                count++;
                if(count==val){
                    prev.next=prev.next.next;
                    break;
                }
                prev=temp;
                temp=temp.next;
            }
            return head;
    }
    private static  void print(Node head){
        Node temp= head;
        while (temp!=null) {
              System.out.println(temp.data +" ");
              temp= temp.next;
          }
          System.out.println("The New Head Node is :"+" "+head.data);
    }
    public static void main(String[] args) {
        int arr[]={12,1,5,22,4};
        Node head = convertArr2LL(arr);
        head=deleteK(head, 3);
        print(head);
    }
}
