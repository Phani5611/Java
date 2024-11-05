
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        this.data = key;
        this.left = this.right = null;
    }
}

class Build {
   public static Node CreateBT(ArrayList<Integer>list){
    if(list.isEmpty()) return null;
    Node root = new Node(list.get(0));
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    int i = 1;
    while(!queue.isEmpty() && i<list.size()){
        Node temp = queue.poll();

        if(i<list.size() && temp.left==null){
            temp.left = new Node(list.get(i));
            queue.add(temp.left);
            i++;
        }
        if(i<list.size() && temp.right==null){
            temp.right = new Node(list.get(i));
            queue.add(temp.right);
            i++;
        }
    }
    return root;}

    public  static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
    public static void preorderTraversal(Node root){
        if(root!=null){
            System.out.println(root.data);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    public static void postorderTraversal(Node root){
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.data);
        }
    }
}
public  class CreateBT{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
       // list.add(7);
       Build obj = new Build();
    
       Node root =  obj.CreateBT(list);
        System.out.println("Inorder traversal of the binary tree:");
        obj.postorderTraversal(root);
    }
}
