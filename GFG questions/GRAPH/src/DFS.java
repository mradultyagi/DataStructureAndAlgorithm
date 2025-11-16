import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

    }
    static void dfs(ArrayList<ArrayList<Integer>> adj ,int V){
//        int count =0; modifications to return no of connected
        boolean [] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(visited[i]==false){
                dfsRec(adj,i,visited);
//                count++;
            }
        }
//        return count;
    }
    static void dfsRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
        visited[s] = true;
        System.out.println(s+" ");
        for(int u : adj.get(s)){
            if(visited[u]==false){
                dfsRec(adj,u,visited);
            }
        }
    }
}
