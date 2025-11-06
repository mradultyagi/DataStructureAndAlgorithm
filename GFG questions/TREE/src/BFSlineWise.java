import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BFSlineWise {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left = new Basics.Node(20);
        root.right = new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right = new Basics.Node(50);
        method2(root);
    }
    static  void bfslevelwise(Basics.Node root){
        if(root == null) return;
        Queue<Basics.Node> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);
        while (q.size()>1){
            Basics.Node curr = q.poll();
            if(curr == null){
                System.out.println();
                q.offer(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);

        }
    }
    static void method2(Basics.Node root){
        Queue<Basics.Node> q = new ArrayDeque<>();
        if(root == null) return;
        q.add(root);
        while (!q.isEmpty()){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Basics.Node curr = q.poll();
                System.out.print(curr.key + " ");
                if(curr.right != null) q.add(curr.right);
                if(curr.left != null ) q.add(curr.left);
            }
            System.out.println();
        }
    }
}
