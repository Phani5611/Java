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
public class inserttAtKthValue {
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
    private static Node insertAtKthNode(Node head,int k, int value){
         Node temp=head;
         int count=0;
         while(temp!=null){
            count ++;
            if(count==k){
                break;
            }
            temp=temp.next;
         }
         if(k==1){
            Node newHead=new Node(value);
            newHead.next=head;               // Created New Head
            newHead.back=null;
            head.back=newHead;
            return newHead;
         }
         Node prev=temp.back;
         Node newNode=new Node(value);
         newNode.next=temp.next;
         newNode.back=prev;
         temp.back=newNode;
         prev.next=newNode;
         return head;
    }
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=convertArr2DLL(arr);
        head=insertAtKthNode(head, 1, 10);
        print(head);
    }
}
