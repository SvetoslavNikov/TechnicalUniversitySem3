package Java.C_Collections.Graph;

import java.util.*;

public class Graph2 {
    public static void main(String[] args) {
        // Create an adjacency list representation of a graph
        AdjacencyList graph = new AdjacencyList();

        // Add vertices and their neighbors
        // Example graph structure:
        //     A
        //    / \
        //   B   C
        //  /   / \
        // D   E   F
        //     |
        //     G

        graph.addElement('A', new char[]{'B', 'C'});
        graph.addElement('B', new char[]{'A', 'D'});
        graph.addElement('C', new char[]{'A', 'E', 'F'});
        graph.addElement('D', new char[]{'B'});
        graph.addElement('E', new char[]{'C', 'G'});
        graph.addElement('F', new char[]{'C'});
        graph.addElement('G', new char[]{'E'});

        System.out.println("DFS traversal starting from vertex A:");
        graph.DFS('A');

        System.out.println("\nDFS traversal starting from vertex C:");
        graph.DFS('C');

        System.out.println("\nDFS traversal starting from vertex E:");
        graph.DFS('E');
    }
}

class AdjacencyList{
    HashMap<Character, char[]> map;

    public AdjacencyList(){
        map = new HashMap<>();
    }

    public void addElement(char c, char[] neighbors){
        map.put(c, neighbors);
    }

    public char[] getNeighbors(char c){
        return map.get(c);
    }

    public void DFS(char start){
        Stack<Character> stack = new Stack<>();
        HashSet<Character> visited = new HashSet<>();

        System.out.print("DFS Path: ");
        stack.push(start);

        while(!stack.isEmpty()){
            char curr = stack.pop();

            if(!visited.contains(curr)) {
                visited.add(curr);
                System.out.print(curr + " ");

                char[] neighbors = this.getNeighbors(curr);
                if(neighbors != null) {
                    // Add neighbors in reverse order to maintain left-to-right traversal
                    for(int i = neighbors.length - 1; i >= 0; i--){
                        char neighbor = neighbors[i];
                        if(!visited.contains(neighbor)) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
        System.out.println(); // New line after traversal
    }
}