import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SpiralTraverse {
    public static void main(String[] args) {

    }
    static void SpiralPrint(Basics.Node root){
        if(root == null)return;
        Queue<Basics.Node> q = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.add(root);
        while (!q.isEmpty()){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Basics.Node curr = q.poll();
                if(reverse){
                    s.push(curr.key);
                }
                else {
                    System.out.println(curr.key);
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(reverse){
                while (s.isEmpty() == false){
                    System.out.println(s.pop()+" ");
                }
            }
            reverse = ! reverse;
        }
    }
}
