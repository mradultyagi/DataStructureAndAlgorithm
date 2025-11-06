public class doubly {
    public static void main(String[] args) {
        doubly list = new doubly();
        Node head = null;

        head = list.insertEnd(head, 10);
        head = list.insertEnd(head, 20);
        head = list.insertEnd(head, 30);
        head = list.insertEnd(head, 40);

//        System.out.println("Doubly linked list (forward):");
//        list.printForward(head);
//
//        System.out.println("Doubly linked list (backward):");
//        list.printBackward(head);
    }

    // Corrected insertEnd method
    Node insertEnd(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp; // Return new node as head
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    // Node class
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    // Print list forward
//    void printForward(Node head) {
//        Node curr = head;
//        while (curr != null) {
//            System.out.print(curr.data + " ");
//            curr = curr.next;
//        }
//        System.out.println();
//    }
//
//    // Print list backward
//    void printBackward(Node head) {
//        if (head == null) return;
//
//        Node curr = head;
//        while (curr.next != null) {
//            curr = curr.next;
//        }
//
//        while (curr != null) {
//            System.out.print(curr.data + " ");
//            curr = curr.prev;
//        }
//        System.out.println();
//    }

    //reverse of doubly link list
    Node reverse(Node head){
        if(head==null || head.next==null)
        {
            return head;
        }
        Node prev =null;
        Node curr=head;

        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
}
