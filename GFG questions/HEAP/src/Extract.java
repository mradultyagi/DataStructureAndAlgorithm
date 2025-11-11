import java.util.ArrayList;
import java.util.Collections;

public class Extract {
    public void heapify(ArrayList<Integer> heap,int i){
        int size = heap.size();
        int largest =  i;
        int lt = (2*i)+1;
        int rt=(2*i)+2;

        if(lt<size && heap.get(lt)>heap.get(largest)){
            largest=lt;
        }
        if(rt<size && heap.get(rt)>heap.get(largest)){
            largest=rt;
        }
        if(largest != i){
            Collections.swap(heap,i,largest);
            heapify(heap,largest);
        }
    }
    int extract(ArrayList<Integer> heap){
        if(heap.size()==0){
            System.out.println("heap is empty");
            return Integer.MAX_VALUE;
        }
        int root = heap.get(0);
        int lastIndex=heap.size()-1;
        Collections.swap(heap,0,lastIndex);
        heap.remove(lastIndex);
        heapify(heap, Integer.MAX_VALUE);
        return root;

    }
}
