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
public class deleteHeadInDLL {
    private static Node convertArr2DLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            temp.back=prev;
            prev=temp;
        }
        return head;
    }
    private static Node deleteHeadNode(Node head){
        if(head.next==null || head==null)return null;
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head; 
    }
    private static void print(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head = convertArr2DLL(arr);
        head=deleteHeadNode(head);
        print(head);
        
    }
}
