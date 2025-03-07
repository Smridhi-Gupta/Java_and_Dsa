package binaryTrees;

public class kthAncestor {
    static class Node {
        int data;
        minimumDistance.Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
//             1
//           /   \
//          2     3
//         / \   / \
//        4   5 6   7
        minimumDistance.Node root = new minimumDistance.Node(1);
        root.left = new minimumDistance.Node(2);
        root.right = new minimumDistance.Node(3);
        root.left.left = new minimumDistance.Node(4);
        root.left.right = new minimumDistance.Node(5);
        root.right.left = new minimumDistance.Node(6);
        root.right.right = new minimumDistance.Node(7);
    }
}
