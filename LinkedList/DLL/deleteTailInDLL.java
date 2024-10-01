package LinkedList.DLL;
class Node{
    int data;
    Node next;
    Node back;

    Node(int data1,Node next1, Node back1){
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
public class deleteTailInDLL {
   private static Node convertArr2DLL(int arr[]){
    Node head= new Node(arr[0]);
    Node prev=head;
    for(int i=1;i<arr.length;i++){
     Node temp=new Node(arr[i]);
     prev.next=temp;
     temp.back=prev;
     prev=temp;
    }return head;
    }
    private static Node deleteTailInDLL(Node head){
        if(head==null || head.next==null)return null;
        Node tail=head;
        while(tail.next!=null){
           tail=tail.next;
        }
        Node prev=tail.back;    // Prev - new Tail node which should be stored.
         prev.next=null;
         tail.back=null;
         

        return head;
    }
    
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=convertArr2DLL(arr);
        head=deleteTailInDLL(head);
        print(head);
    }
}
