import java.util.Arrays;

public class BallmanFord {
    public static void main(String[] args) {

    }
    static int[] ballmanford(int[][] graph ,int s){
        int V = graph.length;
        int [] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[s]=0;
        for (int count = 0; count < V-1; count++) {
            for (int i = 0; i <V ; i++) {
                for (int j = 0; j < V; j++) {

                    if (graph[i][j] != 0 && dist[i] != Integer.MAX_VALUE &&
                            dist[j] > dist[i] + graph[i][j]) {
                        dist[j] = dist[i] + graph[i][j];
                    }
                }
            }
        }
        for (int i = 0; i <V ; i++) {
            for (int j = 0; j < V; j++) {

                if (dist[j] > dist[i] + graph[i][j]) {
                    System.out.println("cycle detected");
                }
            }
        }
        return dist;
    }
}
