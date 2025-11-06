import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left = new Basics.Node(20);
        root.right = new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right = new Basics.Node(50);
        LV(root);

    }
    static int maxlevel =0;
    static void LeftView(Basics.Node root,int level){
        if(root ==  null) return;
        if(maxlevel < level){
            System.out.println(root.key);
            maxlevel = level;
        }
        LeftView(root.left,level+1);
        LeftView(root.right,level+1);

    }
    //Method 2 iterative
    static void LV(Basics.Node root){
        if(root == null) return;
        Queue<Basics.Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Basics.Node curr = q.poll();
                if(i==0){
                    System.out.print(curr.key + " ");
                }


                if(curr.left != null ) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            System.out.println();
        }
    }
}
