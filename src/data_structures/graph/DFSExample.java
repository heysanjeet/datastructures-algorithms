package data_structures.graph;

import java.util.ArrayList;

public class DFSExample {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());

        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 3, 4);

        System.out.println("DFS Traversal....");
        dfs(adj, V, 0);


    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void dfsRecursive(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                dfsRecursive(adj, u, visited);
            }
        }
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean visited[] = new boolean[V];
        dfsRecursive(adj, s, visited);
    }
}
