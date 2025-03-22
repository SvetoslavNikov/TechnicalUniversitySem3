package Java.C_Collections.BinaryTree;

import java.util.Optional;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    public TreeNode insertRecursive(TreeNode root, int val) {

        //reaches empty node
        if (root == null) {
            root = new TreeNode(val);
        }

        if (root.val < val) {
            //goes to the right
            if (root.right != null) {
                insertRecursive(root.right, val);
            }
        } else if (root.val > val) {
            //goes to the left
            if (root.left != null) {
                insertRecursive(root.left, val);
            }
        }

        return root;
    }

    public Optional<TreeNode> searchValue(int val) {
        return Optional.of(searchRecursive(root, val));
    }

    private TreeNode searchRecursive(TreeNode root, int val){
        System.out.println("+1 visited Node");
        if(root == null){
            System.out.println( val + " - No such element, sorry");
            return null;
        }

        if(root.val > val){
            //goes left
            searchRecursive(root.left,val);
        } else if (root.val < val) {
            searchRecursive(root.right, val);
        }
        //if root.val == val;
        return root;
    }

    public void delete(int val){
        root = deleteRecursive(root,val);
    }


    // i come up only with the way:
    //finding the node, deleting it and the others under,
    // and inserting them again which is no good.
    private TreeNode deleteRecursive(TreeNode root, int val){
        if(root == null){
            System.out.println("Sorry no such value");
            return null;
        }

        if(root.val > val){
            //goes left
            deleteRecursive(root.left,val);
        } else if (root.val < val) {
            deleteRecursive(root.right, val);
        }
        //hmm
        return root;
    }


}

