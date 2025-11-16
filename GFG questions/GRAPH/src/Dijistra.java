import java.util.Arrays;

public class Dijistra {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 9, 0},
                {0, 5, 7, 0, 0}
        };

        int[] x= dijistra(graph,0);
        System.out.println(Arrays.toString(x));

    }
    static int[] dijistra(int[][] graph,int source){
        int V = graph.length;
        boolean[] finalize = new boolean[V];
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source]=0;
        for (int i = 0; i < V-1; i++)//can replace v by v-1 bcz last one will automatically minimum
        {
            int u =-1;
            //finalize krega min node ko dist array mai se
            for (int j = 0; j < V; j++) {
                if(!finalize[j] &&(u==-1 || dist[j]<dist[u])){
                    u=i;
                }
            }
            finalize[u]=true;
            //min distance insert krega dist array mai adjacent ka
            for (int j = 0; j < V; j++) {
                if(!finalize[j] && graph[u][j] !=0){
                    dist[j]=Math.min(dist[j],dist[u]+graph[u][j]);
                }
            }

        }
        return dist;

    }
}
