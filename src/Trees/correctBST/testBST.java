package Trees.correctBST;


public class testBST {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(6);

        tree.insert(3);
        tree.insert(5);
        tree.insert(1);
        tree.insert(8);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
tree.insert(4);
        tree.inorder();
    }
}
