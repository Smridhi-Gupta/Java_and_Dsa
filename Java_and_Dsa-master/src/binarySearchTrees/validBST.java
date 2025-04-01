package binarySearchTrees;

public class validBST {
    static class Node {
        int data;
        printRootToLeaf.Node left;
        printRootToLeaf.Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static printRootToLeaf.Node insert(printRootToLeaf.Node root, int val) {
        if (root == null) {
            root = new printRootToLeaf.Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else { // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(printRootToLeaf.Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
