import java.util.ArrayList;

public class DetectCycleDirected {
    public static void main(String[] args) {

    }
    static boolean DFS(ArrayList<ArrayList<Integer>> adj , int V){
        boolean[] visited = new boolean[V];
        boolean[] recSt = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(visited[i]==false){
                if(DFSrec(adj,i,visited,recSt)==true){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,boolean[] recSt){
        visited[s]=true;
        recSt[s]=true;
        for(int u : adj.get(s)){
            if(visited[u]==false && DFSrec(adj, u, visited, recSt)== true){
                return true;
            } else if (recSt[u]==true) {
                return true;
            }
        }
        recSt[s]=false;
        return false;
    }
}
