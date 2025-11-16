import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>(v);
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        printFraph(adj);


    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printFraph(ArrayList<ArrayList<Integer>> adj){
        for (ArrayList<Integer> integers : adj) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

}

