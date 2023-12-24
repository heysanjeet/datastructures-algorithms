package data_structures.graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSExample3 {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);

        System.out.print("Number of islands: "+bfsDiss(adj,V));
    }

    // Print number of islands in a graph (or number of connected components in a graph).

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    private static int bfsDiss(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                bfs(adj, i, visited);
                count++;
            }
        }
        return count;
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
