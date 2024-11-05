
import java.util.*;
import java.util.Queue;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        this.right=this.left=null;
        this.data=key;
    }
}
public class BFS {
    
    public static Node createBT(ArrayList<Integer> list,int index){
      if(index==list.size())return null;
      Node root = new Node(list.get(index));
      root.left = createBT(list,index+1);
      root.right = createBT(list, index+2);
      return root;
    }
    public static void inorderTraversal(Node root){
        if(root == null)return;
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }
    public static List<List<Integer>> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level = queue.size();
            for(int i = 0 ; i<level;i++){
                Node temp = queue.poll();
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
                subList.add(temp.data);
            }
            result.add(subList);
        }
        return result;
    }
    public static void main(String[] args) {
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Node root = createBT(list, index);
       // inorderTraversal(root);
        List<List<Integer>>sol=levelOrder(root);
        System.out.println(sol);
    }
}
