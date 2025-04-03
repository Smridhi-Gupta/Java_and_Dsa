package binarySearchTrees;

public class sortedArrayToBalancedBST {
    static class Node {
        int data;
        mirrorBST.Node left;
        mirrorBST.Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(mirrorBST.Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
