class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// BinaryTree Class
 class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method to insert a new node with given key
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST 
    private Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree 
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // return the (unchanged) node pointer 
        return root;
    }

    public int findMax() {
        return findMaxRec(root);
    }

    private int findMaxRec(Node root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        if (root.right == null)
            return root.key;

        return findMaxRec(root.right);
    }

    private int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public int findTreeDepth() {
        return maxDepth(root);
    }
}

public class Fifth {
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();

        // Insert some nodes
        tree.insert(5);
        tree.insert(3);
        tree.insert(12);
        tree.insert(4);
        tree.insert(10);
        tree.insert(11);
        tree.insert(9);
        tree.insert(33);
        tree.insert(45);
        tree.insert(99);

        System.out.println("Max record: " + tree.findMax());

        System.out.println("Tree Depth: " + tree.findTreeDepth());
    }
}

