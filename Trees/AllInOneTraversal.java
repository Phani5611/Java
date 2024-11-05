import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data  = data;
        this.left = this.right = null;
    }
}
class Tuple{
    Node node;
    int  num;
    public Tuple(Node node,int num){
        this.node = node;
        this.num = num;
    }
}
public class AllInOneTraversal {
    private static Node build(List<Integer>list){
        Node root = new Node(list.get(0));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left==null && index<list.size()){
                temp.left = new Node(list.get(index));
                index++;
                queue.add(temp.left);
            }
            if(temp.right==null && index<list.size()){
                temp.right = new Node(list.get(index));
                index++;
                queue.add(temp.right);
            }
        }
        return root;
    }
    private static void AllTraversal(List<Integer>preorder,List<Integer> inorder, List<Integer>postorder,Node root){
        if (root == null) return;
        Stack<Tuple> st =new Stack<>();
        st.push(new Tuple(root,1));
        while(!st.isEmpty()){
            Tuple tuple = st.pop();
            if(tuple.num == 1){
              preorder.add(tuple.node.data);
              tuple.num++;
              //Adding the removed element with updated number
              st.push(tuple);
            

            //If there exsits left we add to stack
              if(tuple.node.left!=null){
                st.push(new Tuple(tuple.node.left, 1));
              }
            }
            else if(tuple.num==2){
                inorder.add(tuple.node.data);
                tuple.num++;
                st.push(tuple);
                if(tuple.node.right!=null){
                    st.push(new Tuple(tuple.node.right, 1));
                }
            }
            else{
                postorder.add(tuple.node.data);
            }
            }
        }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Node root = build(list);
        List<Integer> preorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        List<Integer> inorder  = new ArrayList<>();
        AllTraversal(preorder,inorder,postorder,root);
        System.out.println(preorder);
        System.out.println(postorder);
        System.out.println(inorder);

    }
}
