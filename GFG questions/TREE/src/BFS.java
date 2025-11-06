import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left = new Basics.Node(20);
        root.right = new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right = new Basics.Node(50);
        bfs(root);

    }
    static void bfs(Basics.Node root){
        if(root == null) return;
        Queue<Basics.Node> q= new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Basics.Node curr = q.poll();
            System.out.println(curr.key);
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
        }
    }
}
