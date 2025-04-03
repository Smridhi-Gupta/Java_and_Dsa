package binarySearchTrees;

public class mirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
//            8
//           / \
//          5   10
//         / \   \
//        3   6   11

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

//      mirror BST should be like this
//            8
//           / \
//         10   5
//         /   / \
//        11  6   3
    }
}
