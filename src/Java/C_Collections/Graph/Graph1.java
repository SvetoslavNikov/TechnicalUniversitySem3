package Java.C_Collections.Graph;

import java.util.ArrayList;

public class Graph1 {
    public static void main(String[] args) {


        AdjacencyMatrix graph = new AdjacencyMatrix(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();


    }
}

class AdjacencyMatrix {
    int[][] matrix;
    ArrayList<Node> nodes;

    public AdjacencyMatrix(int matrixSize) {
        matrix = new int[matrixSize][matrixSize];
        nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        if (nodes.size() > matrix.length) {
            System.out.println("Sorry matrix is full");
            return;
        }
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public void removeEdge(int src, int dst) {
        matrix[src][dst] = 0;
    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {

        System.out.print("  ");
        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(nodes.get(i).data + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }
}