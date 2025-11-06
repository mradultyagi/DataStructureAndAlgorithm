public class DeleteHeadNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Original list:");
        printList(head);

//        head  =deletefirst(head);

//        System.out.println("After deleting head:");
//        printList(head);

        head=deleteLast(head);
        System.out.println("after deleting last");
        printList(head);




    }
    static Node deletefirst(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node deleteLast(Node head){
        if(head == null || head.next==null) return null;
        Node curr =head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;

    }
}
