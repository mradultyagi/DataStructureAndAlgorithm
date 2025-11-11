import java.util.PriorityQueue;

public class PurchaseMaxItems {
    public static void main(String[] args) {
        int [] prices = {20,10,5,30,2,8};
        int budget=30;
        System.out.println(maxItems(prices,budget ));

    }
    public static int maxItems(int[] prices,int budget){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int p : prices) pq.offer(p);
        int count =0;
        while(!pq.isEmpty() && budget >=pq.peek()){
            budget -= pq.poll();
            count++;
        }
        return count;

    }

}
