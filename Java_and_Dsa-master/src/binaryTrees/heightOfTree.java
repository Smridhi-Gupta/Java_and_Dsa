package binaryTrees;

public class heightOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

//    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
//        if (root == null) {
//            return false;
//        }
//
//        path.add(root);
//
//        if (root.data == n) {
//            return true;
//        }
//
//        boolean foundLeft = getPath(root.left, n, path);
//        boolean foundRight = getPath(root.right, n, path);
//
//        if (foundLeft || foundRight) {
//            return true;
//        }
//
//        path.remove(path.size() - 1);
//        return false;
//    }

//    public static Node lca(Node root, int n1, int n2) {
//        ArrayList<Node> path1 = new ArrayList<>();
//        ArrayList<Node> path2 = new ArrayList<>();
//
//        // root se node tak ka path store in path1/path2
//        getPath(root, n1, path1);
//        getPath(root, n2, path2);
//
//        // last common ancestor
//        int i = 0;
//        for (; i < path1.size() && path2.size(); i++) {
//            if (path1.get(i) != path1.get(i)) {
//                break;
//            }
//        }
//
//        // last equal node -> i-1th value
//        Node lca = path1.get(i - 1);
//        return lca;
//    }

    public static void main(String[] args) {
//             1
//           /   \
//          2     3
//         / \   / \
//        4   5 6   7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("height of a tree : " + height(root));

        int n1 = 4, n2 = 5;
//        System.out.println(lca(root, n1, n2).data);
//          2
//         / \
//        4   5
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
    }
}