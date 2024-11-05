package Trees.BinaryTree;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        this.data = key;
        this.right  = this.left = null;
    }
}
public class PostOrderTraversal {
    static int index = 0;
    public static Node createBT(ArrayList<Integer> list){
    if(index == list.size())return null;
    Node root = new Node(list.get(index++));
    root.left = createBT(list);
    root.right = createBT(list);
    return root;
    }
    public static List<Integer> postOrderTraversal(Node root){
    List<Integer> result = new ArrayList<>();
    Stack<Node> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    st1.push(root);
    while(!st1.isEmpty()){
        root = st1.pop();
        st2.push(root.data);
        if(root.left!=null)st1.add(root.left);
        if(root.right!=null)st1.add(root.right);
    }
    while(!st2.isEmpty()){
        result.add(st2.pop());
    }
    return result;
    }
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    int index = 0;
    Node root = createBT(list);
    List<Integer> sol = postOrderTraversal(root);
    System.out.println(sol); 
        
    }
}
