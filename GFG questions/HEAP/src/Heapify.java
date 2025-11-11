import java.util.ArrayList;
import java.util.Collections;

public class Heapify {
    //heapifying max heap
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
    //heapifying min heap
    public void heapify2(ArrayList<Integer> heap,int i){
        int size = heap.size();
        int lt = (2*i)+1;
        int rt=(2*i)+2;
        int smallest=i;

        if(lt<size && heap.get(lt)<heap.get(smallest)){
            smallest=lt;
        }
        if(rt<size && heap.get(rt)<heap.get(smallest) ){
            smallest=rt;
        }
        while (smallest !=i){
            Collections.swap(heap,i,smallest);
            heapify2(heap,smallest);
        }

    }
}
