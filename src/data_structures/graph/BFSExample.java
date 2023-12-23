package data_structures.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);

        System.out.println("Breadth First Traversal......");
        bfs(adj, V, 0);

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean visited[] = new boolean[V + 1];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
}
