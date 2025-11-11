import java.util.ArrayList;
import java.util.Collections;

public class DecreaseKey {
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        Collections.addAll(heap,5,10,15,20,25,30);
        System.out.println("original min heap " + heap);
        replacement(heap,3,2);
        System.out.println("After replacement "+heap);

    }
    public static void replacement(ArrayList<Integer> heap , int index,int value){
        if(index>=heap.size() || index<0){
            System.out.println("invalid");
            return;
        }
        heap.set(index,value);
        while (index>0){
            int parent =(index-1)/2;
            if(heap.get(parent)>heap.get(index)){
                Collections.swap(heap,parent,index);
                index=parent;
            }
            else break;
        }



    }
}
