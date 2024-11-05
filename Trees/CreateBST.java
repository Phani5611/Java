import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = this.right= null;
    }
}
class Build{
    Node root;

    public void build(ArrayList<Integer>list){
        for(int i : list)
        root = buildBST(root,i);
    }
    
    public Node buildBST(Node root,int index){
        if(root==null)root=new Node(index);
        if(index<root.data)
        root.left = buildBST(root.left,index);
        if(index>root.data)
        root.right = buildBST(root.right,index);
        return root;
    }
    public void inOrder(Node root){
        if(root!=null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
public class CreateBST {

    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,7,12,15,2,5));
      Build bt = new Build();
      bt.build(list);
      bt.inOrder(bt.root);
    }
}
