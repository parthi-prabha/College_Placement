package tree;


import java.util.LinkedList;
import java.util.Queue;

public class FullBT {
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }

    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelorder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node ans = q.remove();
            System.out.print(ans.data + " ");
            if(ans.left != null){
                q.add(ans.left);
            }
            if(ans.right != null){
                q.add(ans.right);
            }
        }
    }

    static int findcount(Node root){
        if(root == null) return 0;
        return 1 + findcount(root.left) + findcount(root.right);
    }

    static int findleaf(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return findleaf(root.left) + findleaf(root.left);
    }

    static int sumofnodes(Node root){
        if(root == null) return 0;
        return root.data + sumofnodes(root.left) + sumofnodes(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        inorder(root);
        System.out.println();
        postorder(root);
    }

}
