package tree;

public class BinarySearchTree {
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int data){
        if(root == null) {
            return new Node(data);
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        if(key < root.data){
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    static int findmin(Node root){
        while(root.left != null) root = root.left;
        return root.data;
    }

    static int findmax(Node root){
        while(root.right != null) root = root.right;
        return root.data;
    }

    static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int count(Node root){
        if(root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }

    static int sum(Node root){
        if(root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    static Node delete(Node root, int key){
        if(root == null) return null;
        // for finding the data
        if(key < root.data){
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        }else {
            // used to delete the data based on the three conditions
            if(root.left == null && root.right == null)
                return null;
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            int min = findmin(root.right);
            root.data = min;
            root.right = delete(root.right, min);
        }
        return root;
    }

    static int successor(Node root, int key){
        Node success = null;
        while (root != null){
            if(key < root.data){
                success = root;
                root = root.left;
            }else if (key > root.data){
                root = root.right;
            }else{
                if(root.right != null){
                    Node temp = root.right;
                    while (temp.left != null){
                        temp = temp.left;
                    }
                    success = temp;
                }
                break;
            }
        }
        return success.data;
    }

    static int predecessor(Node root, int key){
        Node prede = null;
        while (root != null){
            if(key < root.data){
                prede = root;
                root = root.left;
            }else if (key > root.data){
                root = root.right;
            }else{
                if(root.left != null){
                    Node temp = root.left;
                    while (temp.right != null){
                        temp = temp.right;
                    }
                    prede = temp;
                }
                break;
            }
        }
        return prede.data;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 4);
        root = insert(root, 12);
        root = insert(root, 18);
        root = insert(root, 11);
        inorder(root);
        System.out.println(findmin(root));
        System.out.println(successor(root, 12));
        System.out.println(predecessor(root, 12));
    }
}
