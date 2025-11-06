import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
    }
}
