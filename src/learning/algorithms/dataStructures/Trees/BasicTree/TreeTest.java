package learning.algorithms.dataStructures.Trees.BasicTree;

public class TreeTest {
    public static void main(String[] args) {
        BST tree = new BST(6);
        tree.setLeft(new Node(4));
        tree.setRight(new Node(8));

        tree.getLeft().setLeft(new Node(3));
        tree.getLeft().setRight(new Node(5));
        tree.getLeft().getLeft().setLeft(new Node(1));

        tree.getRight().setLeft(new Node(7));
        tree.getRight().setRight(new Node(9));
        tree.getRight().getRight().setRight(new Node(10));

        tree.printMe();


    }
}
