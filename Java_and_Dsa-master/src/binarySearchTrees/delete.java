package binarySearchTrees;

public class delete {
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14 };
        search.Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();

        if (search(root, 1)) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }
    }
}
