
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSorting {
    public static void main(String[] args) {
        int V =6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(5).add(0);
        adj.get(5).add(2);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        toposort(adj,V);


    }
    static void toposort(ArrayList<ArrayList<Integer>> adj , int V){
        int[] indegree=new int[V];
        //calculate indegrees
        for (int i = 0; i < V; i++) {
            for(int v: adj.get(i)){
                indegree[v]++;
            }
        }
        //enque with all 0 indegrees
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        //process queue
        ArrayList<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()){
            int u = q.poll();
            topo.add(u);

            for(int v : adj.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }

        }
        if(topo.size() !=V){
            System.out.println("contains cycle");
        }
        else {
            System.out.println("topological order "+topo);
        }


    }

}
