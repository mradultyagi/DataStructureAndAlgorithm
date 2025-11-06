public class UsingArray {
    public static void main(String[] args) {

    }
    class Queue{
        int size,cap;
        int [] arr;
        int front=0;
        Queue(int c){
            cap=c;
            size=0;
            arr=new int[cap];
        }
        boolean isEmpty(){
            return (size == 0);
        }
        boolean isFull(){
            return (size ==  cap);
        }
        void enque(int x){
            if(isFull()) return;
            arr[size]=x;
            size++;

        }
        void deque(){
            if(isEmpty()) return;
            for (int i = 0; i < size-1; i++) {
                arr[i]=arr[i+1];
            }
            size--;

        }
        int getFront(){
            if(isEmpty()){
                return -1;
            }
            else {
              return arr[0];
            }
        }
        //CIRCULAR ARRAY USE FOR O(N)
        int gerFront(){
            if(isEmpty()){
                return -1;
            }
            else return front;
        }
        int getRear(){
            if(isEmpty()){
                return 0;
            }
            else return (front + size -1)%cap;
        }
        void enque2(int x){
            if(isFull()) return;
            int rear=getRear();
            rear=(rear+1)%cap;
            arr[rear]=x;
            size++;
        }
        void deque2(){
            if(isEmpty()) return;
            front=(front+1)%cap;
            size--;
        }
    }

}
