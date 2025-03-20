package Java.C_Collections.BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {

//       1
//      / \
//     2   3
//    / \
//   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

//    public void addLeftNode(int value){
//        leftNode = new Node(value);
//    }
//
//    public void addRightNode(int value){
//        rightNode = new Node(value);
//    }

