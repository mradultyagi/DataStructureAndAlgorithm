import java.util.ArrayList;
import java.util.Collections;

public class InsertionDeletion {
    public static void main(String[] args) {
        InsertionDeletion heap = new InsertionDeletion();
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.print();
    }
    ArrayList<Integer> heap = new ArrayList<>();
    public void insert(int val){
        heap.add(val);
        int i = heap.size()-1;

        while(i>0){
            int parent=(i-1)/2;
            if(heap.get(i)> heap.get(parent)){
                Collections.swap(heap,i,parent);
                i=parent;
            }
            else break;
        }

    }
    public void print(){
        System.out.println(heap);
    }

}

