package binaryTrees;

public class transformToSumTree {
    static class Node {
        int data;
        lowestCommonAncestor2.Node left, right;

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
        lowestCommonAncestor2.Node root = new lowestCommonAncestor2.Node(1);
        root.left = new lowestCommonAncestor2.Node(2);
        root.right = new lowestCommonAncestor2.Node(3);
        root.left.left = new lowestCommonAncestor2.Node(4);
        root.left.right = new lowestCommonAncestor2.Node(5);
        root.right.left = new lowestCommonAncestor2.Node(6);
        root.right.right = new lowestCommonAncestor2.Node(7);
    }
}
