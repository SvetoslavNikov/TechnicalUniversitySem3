package Java.LEETCODE.BinaryTreeEx.StandardBinaryTree;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class Operations {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        inorder(root);  // Expected output: 4 2 5 1 6 3 7
        System.out.println();

        preorder(root); //Expected output: 1 2 4 5 3 6 7
        System.out.println();

        postorder(root); //Expected output: 4 5 2 6 7 3 1
        System.out.println();

        System.out.println(totalSum(root));//Expected output: 28

        System.out.println(findMax(root));//Expected output: 7

        System.out.println(findHeight(root));//Expected output: 3

        System.out.println(valExists(root,7));//Expected output: true
        System.out.println(valExists(root,8));//Expected output: false
        System.out.println(valExists(root,2));//Expected output: true

        reverseTree(root);
        inorder(root);//// Expected output: 7 3 6 1 5 2 4
    }
     /*
                1
              /   \
             2     3
            / \   / \
           4  5  6   7
        */

    //left -> root -> right
    public static void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }

    //root->left->right

    public static void preorder(TreeNode node){
        if(node == null) return;
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }

    //Left -> right -> root
    public static void postorder(TreeNode node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }

    public static int totalSum(TreeNode node){
        if(node == null) return 0;
        int leftSum = totalSum(node.left);
        int rightSum = totalSum(node.right);
        return node.val + leftSum + rightSum;
    }

    public static int findMax(TreeNode node){
        if(node == null) return 0;//assuming they are only positive nums
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);
        return Math.max(node.val, Math.max(leftMax, rightMax));
    }

    public static int findHeight(TreeNode node){
        if(node == null) return 0;
        int leftSubTree = findHeight(node.left);
        int rightSubTree = findHeight(node.right);
        //1 represents the current node
        return 1 + Math.max(leftSubTree, rightSubTree);
    }

    public static boolean valExists(TreeNode node, int val){
        if(node == null) return false;
        boolean leftSubTree = valExists(node.left, val);
        boolean rightSubTree = valExists(node.right, val);
        if(leftSubTree || rightSubTree || node.val == val){
            return true;
        }
        return false;
    }

    public static void reverseTree(TreeNode node){
        if(node == null) return;
        reverseTree(node.left);
        reverseTree(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
//                1
//              /   \
//             2     3
//            / \   / \
//           4  5  6   7

}
