package learning.algorithms.dataStructures.Trees.correctBST;

import java.util.*;

class Node {
    Node left;
    int val;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class BST {
    Node root;

    public void insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return;
        }

        Node prev = null;
        Node temp = root;
        while (temp != null) {
            if (temp.val > key) {//goes down the left side
                prev = temp;//node
                temp = temp.left; //if there is no more levels down to go it breaks;
                //else it set the new temp to the left branch of the current node;
            } else if (temp.val < key) {//goes down the right side
                prev = temp;//node
                temp = temp.right;//if there is no more levels down to go it breaks;
                //else it set the new temp to the right branch of the current node;
            }
        }
        if (prev.val > key) {
            prev.left = node;
        } else {
            prev.right = node;
        }
    }

    public void reverseOrder(){
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while(temp != null || !stack.isEmpty()){
            if(temp != null){
                stack.add(temp);
                temp = temp.right;
            } else {
                temp = stack.pop();
                System.out.print(temp.val + " ");
                temp = temp.left;
            }
        }
    }

    public void inorder() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                stack.add(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.val + " ");
                temp = temp.right;
            }
        }
    }
    //recursive way
    void inOrderDescending(Node node) {
        if (node != null) {
            inOrderDescending(node.right);  // Loads the Right subtree
            System.out.print(node.val + " ");  // Root
            inOrderDescending(node.left);  // Left subtree
        }
    }

    void inOrderIncreasing(Node node){
        if
        (node!= null){
            inOrderIncreasing(node.left);
            System.out.print(node.val + " ");
            inOrderIncreasing(node.right);
        }
    }

}