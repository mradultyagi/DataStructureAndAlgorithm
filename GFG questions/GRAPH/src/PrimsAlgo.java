import java.util.Arrays;

public class PrimsAlgo {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 9, 0},
                {0, 5, 7, 0, 0}
        };

       int x= prims(graph,5);
        System.out.println(x);

    }
    static int prims(int graph[][],int V){
        int[] key= new int[V];
        int res =0;
        boolean[] mset=new boolean[V];
        Arrays.fill(key,Integer.MAX_VALUE );
        key[3]=0;
        for (int i = 0; i < V; i++) {
            int u =-1;
            for (int k = 0; k < V; k++) {
                if(!mset[k]&&(u==-1 || key[k]<key[u])){
                    u= k;
                }
            }
            mset[u]=true;
            res+=key[u];
            for (int j = 0; j < V; j++) {
                if(!mset[j]&&graph[u][j] !=0 && graph[u][j]<key[j]){
                    key[j]=graph[u][j];
                }
            }

        }
        return res;

    }
}
