package LinkedList.ProblemsOnLL;
class Node{
    int data;Node next; Node back;

    Node(int data1,Node next1,Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Node (int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}
public class reverseDLL {
    private static Node convertArr2DLL(int arr[]){
     Node head = new Node(arr[0]);
     Node prev=head;
     for(int  i=1;i<arr.length;i++){
        Node temp= new Node(arr[i]);
        prev.next=temp;
        temp.back=prev;
        prev=temp;
     }return head;
    }
    private static Node reverseDLL(Node head){
        Node current =head;
        Node last=null;
        while(current!=null){
            last=current.back;
            current.back=current.next;
            current.next=last;
            current=current.back;   
        }
        Node newHead=last.back;
        return newHead;
    }
    private static void print(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=convertArr2DLL(arr);
         head=reverseDLL(head);
        print(head);
    }

}
