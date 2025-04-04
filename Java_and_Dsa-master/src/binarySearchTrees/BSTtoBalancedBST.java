package binarySearchTrees;

public class BSTtoBalancedBST {
    static class Node {
        int data;
        sortedArrayToBalancedBST.Node left;
        sortedArrayToBalancedBST.Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(sortedArrayToBalancedBST.Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
