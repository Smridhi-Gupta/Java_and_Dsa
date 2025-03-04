package binaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class topView {
    static class Node {
        int data;
        heightOfTree.Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info1 {
        heightOfTree.Node node;
        int hd;

        public Info1(heightOfTree.Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(heightOfTree.Node root) {
        // level order
        Queue<Info1> q = new LinkedList<>();
        HashMap<Integer, heightOfTree.Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info1(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info1 curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                // first time hd is occuring
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info1(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info1(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max ; i++) {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//             1
//           /   \
//          2     3
//         / \   / \
//        4   5 6   7
        heightOfTree.Node root = new heightOfTree.Node(1);
        root.left = new heightOfTree.Node(2);
        root.right = new heightOfTree.Node(3);
        root.left.left = new heightOfTree.Node(4);
        root.left.right = new heightOfTree.Node(5);
        root.right.left = new heightOfTree.Node(6);
        root.right.right = new heightOfTree.Node(7);

        System.out.println("top view of a tree : ");
        topView(root);
    }
}
