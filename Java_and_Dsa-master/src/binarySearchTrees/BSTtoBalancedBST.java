package binarySearchTrees;

public class BSTtoBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node balancedBST(Node root) {
        // inorder seq

        // sorted inorder -> balanced BST
    }

    public static void main(String[] args) {
//              8
//             / \
//            6   10
//           /      \
//          5        11
//         /           \
//        3             12
//        given BST

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


//            8
//           / \
//          5   11
//         /\   / \
//        3  6 10  12
//        expected BST
    }
}
