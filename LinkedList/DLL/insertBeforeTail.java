package LinkedList.DLL;
class Node{
    int data;
    Node back;
    Node next;

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
public class insertBeforeTail {
    private static Node convertArr2DLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            temp.back=prev;
            prev=temp;
        }
        return head;
    }
    private static Node insertBeforeTail(Node head, int val){
        Node tail=head;
        Node prev=null;
        if(head.next==null){
                Node newHead=new Node(val);
                newHead.next=head;               // Created New Head
                newHead.back=null;
                head.back=newHead;
                return newHead;
             }

        while(tail.next!=null){
            tail=tail.next;
        }
        prev=tail.back;
        Node newNode = new Node(val);
        newNode.next=tail;
        newNode.back=prev;
        prev.next=newNode;
        tail.back=newNode;
        return head;
    }
    private static void print(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        Node head=convertArr2DLL(arr);
        head=insertBeforeTail(head, 0);
        print(head);
    }
}
