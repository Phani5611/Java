package LinkedList.SingleLinkedList;
import java.util.List;


// JAVA DOESN'T HAVE struct keyword only Class 

class Node{
    int data;
    Node next;   // Creating a self datatype for linked list

    // Node(int data1, Node next1){
    //  this.data=data1;
    //  this.next=next1;      //initialization
    // }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }

 } 

 public class linkedListCreationAndDisplay {

    // Convert Array to LinkedList

 private static Node convertArr2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    //Length of Linked List
    private static int lengthofLL(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
            
    }
    return count;
}

// Checking In Linked List

 private static boolean checkInLL(Node head, int val){
  Node temp = head;
    while(temp!=null){
        if(temp.data==val)
        return true;
        temp = temp.next;
    }
    return false;
 }
 
    public static void main(String[] args) {
     int arr[]={10,2,3,4,5,6};
     Node head = convertArr2LL(arr);
     System.out.println(head);
    // // Traversal
    // Node temp = head;
    // while(temp!=null){
    //     System.out.print(temp.data+" ");
    //     temp = temp.next;
    // }
    // System.out.println();
    // //  System.out.println("Length of linked list is :"+lengthofLL(head));
    }

}

