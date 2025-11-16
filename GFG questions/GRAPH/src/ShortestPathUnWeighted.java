import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnWeighted {
    public static void main(String[] args) {

    }
    static void shortest(ArrayList<ArrayList<Integer>> adj,int source){
        int[] dist=new int[adj.size()];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source]=0;
        boolean [] visited = new boolean[adj.size()];
        visited[source]=true;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        int u=q.poll();
        for(int v: adj.get(u)){
            if(visited[v]==false){
                dist[v] = dist[u]+1;
                visited[v]=true;
                q.add(v);
            }
        }



    }
}
