import java.util.*;

class PrimAlgorithm {


    static class Edge {
        int weight, vertex;

        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }


    public static void prim(int[][] graph, int startVertex) {
        int n = graph.length;
        boolean[] inMST = new boolean[n];
        int[] parent = new int[n];
        int[] key = new int[n];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[startVertex] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> key[i]));

        pq.add(startVertex);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            inMST[u] = true;
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !inMST[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                    pq.add(v);
                }
            }
        }

        System.out.println("Edges in the MST:");
        int totalWeight = 0;
        for (int v = 1; v < n; v++) {
            if (parent[v] != -1) {
                System.out.println(parent[v] + " - " + v + " with weight " + graph[v][parent[v]]);
                totalWeight += graph[v][parent[v]];
            }
        }
        System.out.println("\nTotal weight of the MST: " + totalWeight);
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0, 2, 0, 0, 0, 0, 0, 4},
                {2, 0, 3, 6, 0, 0, 0, 0},
                {0, 3, 0, 1, 0, 0, 0, 0},
                {0, 6, 1, 0, 5, 0, 0, 0},
                {0, 0, 0, 5, 0, 7, 0, 0},
                {0, 0, 0, 0, 7, 0, 8, 0},
                {0, 0, 0, 0, 0, 8, 0, 9},
                {4, 0, 0, 0, 0, 0, 9, 0}
        };


        prim(graph, 0);
    }
}
