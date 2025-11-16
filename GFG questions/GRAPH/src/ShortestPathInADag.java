import java.util.*;

public class ShortestPathInADag {

    static void shortestPath(int V, ArrayList<ArrayList<Pair>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V];

        // Step 1: Topological Sort
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSort(i, adj, visited, st);
            }
        }

        // Step 2: Relax edges in topological order
        while (!st.isEmpty()) {
            int u = st.pop();

            if (dist[u] != Integer.MAX_VALUE) {
                for (Pair p : adj.get(u)) {
                    int v = p.v;
                    int wt = p.wt;

                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // Print result
        System.out.println("Shortest distances:");
        for (int d : dist) {
            System.out.print(d + " ");
        }
    }

    // DFS for Topological Sort
    static void topoSort(int node, ArrayList<ArrayList<Pair>> adj,
                         boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for (Pair p : adj.get(node)) {
            if (!visited[p.v]) {
                topoSort(p.v, adj, visited, st);
            }
        }
        st.push(node);
    }

    // Pair class to store (vertex, weight)
    static class Pair {
        int v, wt;
        Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // edges: u → v with weight wt
        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(4, 1));
        adj.get(4).add(new Pair(2, 3));
        adj.get(4).add(new Pair(5, 4));
        adj.get(1).add(new Pair(2, 3));
        adj.get(2).add(new Pair(3, 6));

        shortestPath(V, adj, 0);
    }
}
