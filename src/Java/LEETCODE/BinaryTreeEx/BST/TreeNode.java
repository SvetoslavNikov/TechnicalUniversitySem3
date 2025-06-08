package Java.LEETCODE.BinaryTreeEx.BST;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree{
    TreeNode root;

    //Insert a value into the BST
    public void insert(int val){
        // avoids forcing the user to pass the root node manually
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode node, int val) {
        if(node == null){
            return new TreeNode(val);
        }

        if(val < node.val){
            node.left = insertRecursive(node.left, val);
        } else if(val > node.val){
            node.right = insertRecursive(node.right, val);
        }

        //ignore duplicates
        return node;
    }

    //Search a value
    public boolean search(int val){
        // avoids forcing the user to pass the root node manually
        return searchRecursive(root, val);
    }

    private boolean searchRecursive(TreeNode node, int val) {
        if(node == null) return false;
        if(val == node.val) return true;
        return val < node.val ? searchRecursive(node.left, val)
                : searchRecursive(node.right, val);
    }

    // In-order traversal
    public void inOrder() {
        inOrderRecursive(root);
        System.out.println(); // newline after traversal
    }

    private void inOrderRecursive(TreeNode node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.val + " ");
            inOrderRecursive(node.right);
        }
    }

    // Print the tree sideways (right is up)
    public void printTree() {
        printRecursive(root, 0);
        System.out.println("---------------------");
    }
    private void printRecursive(TreeNode node, int level) {
        if (node == null) return;

        printRecursive(node.right, level + 1);

        for (int i = 0; i < level; i++) System.out.print("    ");
        System.out.println(node.val);

        printRecursive(node.left, level + 1);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {40, 20, 60, 10, 30, 50, 70, 25, 35};
        for (int val : values) {
            System.out.println("Inserting: " + val);
            bst.insert(val);
            bst.printTree();  // visualize after each insert
        }

        System.out.print("Final In-order traversal: ");
        bst.inOrder();
    }

}
