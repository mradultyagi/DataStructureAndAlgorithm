import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumbers {
    public static void main(String[] args) {
        printFirstN(10);

    }
    static void  printFirstN(int n ){
        Queue<String> q = new ArrayDeque<>();
        q.add("5");
        q.add("6");
        for (int i = 0; i < n; i++) {
            String curr = q.peek();
            System.out.println(curr);
            q.remove();
            q.offer(curr+"5");
            q.offer(curr+"6");
        }

    }
}
