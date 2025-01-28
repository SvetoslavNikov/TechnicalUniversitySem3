package learning.algorithms.university.sorting.dataStructures.Graph;

import java.util.*;

public class Graph1 {
    public static void main(String[] args) {
    AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
//        AdjacencyList graph = new AdjacencyList();
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        graph.print();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);
        graph.print();
//        graph.depthFirstSearch(0);



    }
}


class AdjacencyMatrixGraph {
    private int[][] matrix;
    private List<Node> nodes;

    public AdjacencyMatrixGraph(int matrixSize){
        matrix = new int[matrixSize][matrixSize];
        nodes = new ArrayList<>();
    }

    public void breadthFirstSearch(int src) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (queue.size() != 0) {

            src = queue.poll();
            System.out.println(nodes.get(src).getData() + " = visited");

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }
    private void dFSHelper(int src, boolean[] visited) {

        if(visited[src]) {
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).getData() + " = visited");
        }

        for(int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
        return;
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addNode(Node node, int idx){
         if(idx < nodes.size()){
            nodes.add(idx, node);
            System.out.printf("At index %d is %c. Other %d elements were shifted to the right", idx, node.getData(), nodes.size() - idx + 1 );
         } else {
             nodes.add(node);
             System.out.printf("Node %c added at the end", node.getData());
         }
    }

    private boolean checkSourceDestination(int source, int destination){
        if(source < matrix.length && destination < matrix.length){
            return true;
        } else {
            System.out.println("Source/Destination out of bound");
        }
        return false;
    }

    public void addEdge(int source, int destination){
        if(!checkSourceDestination(source,destination)) return;

        matrix[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination){
        if(!checkSourceDestination(source,destination)) return false;
        if(matrix[source][destination] == 1){
            return true;
        }
        return false;
    }

    public void removeEdge(int source, int destination){
        if(!checkSourceDestination(source,destination)) return;
        matrix[source][destination] = 0;
    }

    public void print(){
// 4 4 4 - breadth
// 3 0 0
// 3 0 0
// |
// length
        System.out.print("  ");
        for (Node node:nodes){
            System.out.print(node.getData() + " ");
        }
        System.out.println();

        int matrixSize = matrix.length;
        for (int i = 0; i < matrixSize; i++) {
            System.out.print(nodes.get(i).getData()+" ");
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class AdjacencyList{
    private List<LinkedList<Node>> nodeLs;

    public AdjacencyList(){
        nodeLs = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        nodeLs.add(currentList);
    }

    public void addEdge(int source, int destination){
        nodeLs.get(source).add(nodeLs.get(destination).getFirst());
    }

    public boolean checkEdge(int src, int dst){
        if(nodeLs.get(src).contains(nodeLs.get(dst).getFirst())){
            return true;
        }
        return false;
    }

    public void removeEdge(int src, int dst){
        if(checkEdge(src,dst)){
            List<Node> currentList = nodeLs.get(src);
            int idx = currentList.indexOf(nodeLs.get(dst).getFirst());
            currentList.remove(idx);
        }
    }

    public void print(){
        for (int i = 0; i < nodeLs.size(); i++) {
            for (int j = 0; j < nodeLs.get(i).size(); j++) {
                System.out.print(nodeLs.get(i).get(j).getData());

                if(j < nodeLs.get(i).size() - 1){
                    System.out.print(" -> ");
                }
            }
            System.out.println("");
        }
        System.out.println();
    }
}

class Node{
    private char data;

    public Node(char data){
        this.data = data;
    }

    public void setData(char data){
        this.data = data;
    }

    public char getData(){
        return this.data;
    }

}














