import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Kosaraju {
    public static void main(String[] args) {

    }
    //return strongly connecteds
    //every node reachable from each other f
    static void dfs1(ArrayList<ArrayList<Integer>> adj, int u,
                     boolean[] visited, Stack<Integer> st){
        visited[u]=true;
        for(int v:adj.get(u)){
            if(!visited[u]){
                dfs1(adj,v,visited,st);
            }
        }
        st.push(u);
    }
    static void dfs2(ArrayList<ArrayList<Integer>> adj , int u,boolean[] visited){
        visited[u]=true;
        System.out.print(u+" ");
        for(int v:adj.get(u)){
            if (!visited[v]){
                dfs2(adj,v,visited);
            }
        }
    }
    static void raju(ArrayList<ArrayList<Integer>> adj, int V){
        Stack<Integer> st = new Stack<>();
        boolean [] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                dfs1(adj,i,visited,st);
            }
        }
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            transpose.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for(int v:adj.get(i)){
                transpose.get(v).add(i);
            }
        }
        Arrays.fill(visited,false);
        while (!st.isEmpty()){
            int x = st.pop();
            if(!visited[x]){
                System.out.println(("SCC"));
                dfs2(transpose,x,visited);
                System.out.println();
            }
        }

    }
}
