import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left = new Basics.Node(20);
        root.right = new Basics.Node(30);
        root.left.left = new Basics.Node(40);
        root.left.right = new Basics.Node(50);
        root.right.left = new Basics.Node(40);
        root.right.right = new Basics.Node(50);
        System.out.println(maxwidth(root));

    }
    static int maxwidth(Basics.Node root){
        if(root == null) return 0;
        Queue<Basics.Node> q = new LinkedList<>();
        q.add(root);
        int res =0;
        while(!q.isEmpty()){
            int count = q.size();
            res= Math.max(res,count);
            for (int i = 0; i < count; i++) {
                Basics.Node curr = q.poll();
                if(curr == null) continue;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return res;
    }
}
