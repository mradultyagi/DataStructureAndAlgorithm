import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(2);
        q.add(3);
        q.add(4);
        reverse2(q);
        System.out.println(q);


    }
    static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }

    }
    //recurssion
    static void reverse2(Queue<Integer> q){
        if(q.isEmpty())
            return;
        int x = q.poll();
        reverse(q);
        q.offer(x);
    }
}
