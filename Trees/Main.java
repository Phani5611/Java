import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        this.data = key;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    // Method to insert a new node
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive method to insert a new node
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Inorder traversal of the binary tree
    public List<Integer> inorderTraversal(Node root,ArrayList<Integer> ds) {
        if (root != null) {ds.add(root.data);}
            inorderTraversal(root.left,ds);
            inorderTraversal(root.right,ds);
    }
}
public class Main{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // Create an ArrayList of elements to be inserted
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);

        // Insert each value into the binary tree
        for (int value : values) {
            tree.insert(value);
        }
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println("Inorder traversal of the binary tree:");
        tree.inorderTraversal(tree.root,ds);
        System.out.println(ds);
    }
}

