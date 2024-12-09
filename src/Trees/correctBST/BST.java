package Trees.correctBST;

import java.util.*;

class correctedBST {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(30);
        tree.insert(50);
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);
        tree.insert(60);
        tree.inorder();
    }
}

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
}