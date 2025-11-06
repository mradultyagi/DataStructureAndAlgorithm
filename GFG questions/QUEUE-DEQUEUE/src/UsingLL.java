
public class UsingLL {
    public static void main(String[] args) {

    }
    class Node {
        int data;
        Node next;
        Node(int x){
            data =x;
            next=null;
        }
    }
    class Queue{
        Node front;
        Node rear;
        Queue() {
            front = null;
            rear = null;
        }
        void enque(int x){
            Node temp =new Node(x);
            if(rear==null){
                front=rear=temp;
                return;
            }
            rear.next=temp;
            rear=temp;
        }

        void deque(){
            if(front==null){
                return;
            }
            front=front.next;
            if(front==null){
                rear=null;
            }
        }

    }
}
