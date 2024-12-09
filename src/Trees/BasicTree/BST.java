package Trees.BasicTree;

import java.nio.file.Path;

public class BST {

    private int root;
    private Node left;
    private Node right;

    public void printMe(){
        printLEFT(this.getLeft());
        System.out.println("ROOT: " + this.getRoot());
        printRight(this.getRight());
    }

    public void printLEFT(Node node){
        if(node.getLeft() == null){
            System.out.println("LEFT: "+ node.getValue());
            return;
        }
        if(node.getRight() != null){
            printRight(node.getRight());
        }
        printLEFT(node.getLeft());
        System.out.println("LEFT: "+ node.getValue());

    }

    public void printRight(Node node){
        if(node.getRight() == null){
            System.out.println("RIGHT: " + node.getValue());
            return;
        }

        if(node.getLeft() != null){
            printLEFT(node.getLeft());
        }

        printRight(node.getRight());
        System.out.println("RIGHT: "+ node.getValue());

    }
    public BST(int root) {
        this.root = root;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
