import java.util.ArrayList;

public class DetectCycle {
    public static void main(String[] args) {
        int V =5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            adj.add(new ArrayList<>());
        }
        Basics.addEdge(adj,0,1);
        Basics.addEdge(adj,1,2);
        Basics.addEdge(adj,2,3);
        Basics.addEdge(adj,3,4);
        Basics.addEdge(adj,4,1);
        if(DFS(adj,V)){
            System.out.println("cycle detected");
        }



    }
    static boolean DFS(ArrayList<ArrayList<Integer>> adj,int V){
        boolean[] visited=new boolean[V+1];
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                if (DFSrec(adj, i, visited, -1) == true){
                    return true;
                }
            }

        }
        return false;


    }
    static boolean DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,int parent){
        visited[s]=true;
        for(int u:adj.get(s)){
            if(visited[u]==false){
                if(DFSrec(adj,u,visited,s)==true){
                    return true;
                }
            } else if (u != parent) {
                return true;

            }
        }
        return false;
    }

}
