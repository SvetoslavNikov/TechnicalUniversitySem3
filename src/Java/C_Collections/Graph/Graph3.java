package Java.C_Collections.Graph;

import java.util.*;

public class Graph3 {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int src, int dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);
        // adjList.get(dest).add(src); // Uncomment for undirected graph
    }

    public void bfsDirected(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>(); // optional for directed graphs to avoid cycles

        queue.offer(start);
        visited.add(start);

        System.out.println("BFS directed graph:");
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.println(curr);

            List<Integer> neighbors = adjList.getOrDefault(curr, Collections.emptyList());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public void bfsUndirected(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        System.out.println("BFS undirected graph:");
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.println(curr);

            List<Integer> neighbors = adjList.getOrDefault(curr, Collections.emptyList());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public void dfsDirected(int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);
        visited.add(start);

        System.out.println("DFS directed graph:");
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            System.out.println(curr);

            List<Integer> neighbors = adjList.getOrDefault(curr, Collections.emptyList());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public void dfsUndirected(int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);
        visited.add(start);

        System.out.println("DFS undirected graph:");
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            System.out.println(curr);

            List<Integer> neighbors = adjList.getOrDefault(curr, Collections.emptyList());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
