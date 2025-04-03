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

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

//            8
//           /  \
//          5    11
//         / \   / \
//        3   6 10 12
//        expected BST
    }
}
