import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());

        // Component 1
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Component 2
        adj.get(3).add(4);
        adj.get(4).add(3);

        // Components 3: isolated 5, 6 (no edges)

        BFS obj = new BFS();
        System.out.println("BFS traversal of disconnected graph:");
        obj.bfsDISS(adj, v);
    }

    // BFS for one connected component
    static void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int x : adj.get(u)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }

    // BFS for disconnected graph
    void bfsDISS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfs(adj, v, i, visited);
                System.out.println(); // new line for each component
            }
        }
    }
}
