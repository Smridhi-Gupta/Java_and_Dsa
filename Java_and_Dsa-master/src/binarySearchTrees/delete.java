package binarySearchTrees;

public class delete {
    static class Node {
        int data;
        search.Node left;
        search.Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
    }
}
