package LL;
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

//    public void insertFirst(int val) {
//        Node node = new Node(val);
//        node.next = head;
//        head = node;
//
//        if (tail == null) {
//            tail = head;
//        }
//        size += 1;
//    }
    public void insertFirst(int val ){
        Node node = new Node (val);
        node.next= head;
        head=node;
        if(tail == null){
            tail=head;
        }
        size+=1;
    }
//    public void display(){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.value + "->");
//            temp=temp.next;
//        }
//        System.out.println("END");
//    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value+"->");
            temp=temp.next;

        }
        System.out.println("END");
    }
    //use void if you dont want to return the removed value to show
//    public int deletefirst(){
//
//        if(head==null){
//            tail=null;
//
//        }
//        int value= head.value;
//        head=head.next;
//        size--;
//        return value;
//
//    }
    //Delete First
    public int deletefirst(){
        int val = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

//    public int deletelast(){
//        if(size<=1){
//            return deletefirst();
//
//        }
//
//        Node secondlast =  get(size-2);
//        int val = tail.value;
//        tail = secondlast;
//        tail.next=null;
//        size--;
//        return val;
//
//    }
    //DELETE LAST
    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlaset=get(size-2);
        int val =tail.value;
        tail=secondlaset;
        tail.next=null;
        size--;
        return val;
    }
//    public int delete (int index){
//        if(index==0){
//            return deletefirst();
//        }
//        if(index==size-1){
//            return deletelast();
//        }
//        Node prev = get(index-1);
//        int val = prev.next.value;
//        prev.next=prev.next.next;
//        return head.value;
//
//
//    }
    public int delete (int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return head.value;
    }
//    public Node get(int index){
//        Node node = head;
//        for (int i = 0; i < index; i++) {
//            node = node.next;
//        }
//        return node;
//    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
//    public Node find(int value){
//        Node node = head;
//        while(node!=null){
//            if(node.value == value){
//                return node;
//            }
//            node=node.next;
//        }
//        return null;
//    }
public Node find(int value) {
    Node node = head;
    for (int i = 0; i < size; i++) { // Corrected loop condition
        if (node.value == value) {   // Corrected equality check
            return node;
        }
        node = node.next;
    }
    return null; // Added return statement for cases where the value is not found
}



    //    public void insertlast(int val){
//
//        if(tail == null){
//            insertFirst(val);
//            return;
//        }
//
//        Node node = new Node(val);
//        tail.next=node;
//        tail=node;
//        size++;
//
//    }
    public void insertlast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail = node;
        size++;
    }
//    public void insert (int val , int index){
//        if(index == 0){
//            insertFirst(val);
//            return;
//        }
//        if(index==size){
//            insertlast(val);
//            return;
//        }
//        Node temp =head;
//        for (int i = 1; i < index; i++) {
//            temp=temp.next;
//
//        }
//        Node node = new Node(val , temp.next);
//        temp.next=node;
//        size++;
//
//    }
    public void insert(int val , int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    //ll insert  by recurssion
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp = new Node (val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);

        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
