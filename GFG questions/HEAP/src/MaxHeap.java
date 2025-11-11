import java.util.Collection;
import java.util.Collections;

public class MaxHeap {
    int []  arr ;
    int size;
    int capacity;

    public MaxHeap( int capacity) {
        arr = new int [capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    int parent(int i ){
        return (i+1)/2;
    }
    void printHeap(){
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void insert(int x){
        if(size == capacity){
            System.out.println("heap is full");
            return;
        }
        size++;
        arr[size-1]=x;
        int i = size-1;
        while (i!=0 && arr[parent(i)]<arr[i]){
            int temp = arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;

            i = parent(i);

        }
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.printHeap();
    }
}
