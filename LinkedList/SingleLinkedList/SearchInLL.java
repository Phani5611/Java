package LinkedList.SingleLinkedList;

class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class SearchInLL {
    private static Node convertArr2LL(int arr[])
    {
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i=1;i<arr.length;i++){      // Insertion into the Linked List
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }

    // Checking A Specific Elment In A Linked List

    private static boolean checkInLL(Node head, int val){
        Node temp = head;
          while(temp!=null){
              if(temp.data==val)   // Traversal
              return true;
              temp = temp.next;
          }
          return false;
       }
      
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head = convertArr2LL(arr);
    System.out.println(checkInLL(head,4));
    }
}
