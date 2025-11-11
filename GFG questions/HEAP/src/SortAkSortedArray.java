import java.util.Arrays;
import java.util.PriorityQueue;

public class SortAkSortedArray {
    public static void main(String[] args) {
        int[] arr={9,8,7,19,18};
int n = arr.length;
int k = 2;
       sortK(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    static void sortK(int[] arr,int n,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);

        }
        int index =0;
        for (int i = k+1; i < n; i++) {
            arr[index++]=pq.poll();
            pq.add(arr[i]);

        }
        while (pq.isEmpty()==false)
            arr[index++]=pq.poll();
    } 
}
