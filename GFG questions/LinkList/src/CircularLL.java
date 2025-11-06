public class CircularLL {
    public static void main(String[] args) {
//        Node head=new Node(10);
//        head.next=new Node(20);
//        head.next.next=new Node(30);
//        head.next.next.next=head;
//
////        head = insertBegin(head,15);
//        head = insertEnd(head,15);
//        printlist(head);

        Node head=new Node(10);
        head.next=new Node(20);
        head.next.prev=head;
        head.next.next=head;
        head.prev=head.next;
        insertFirst(head,25);
        printlist(head);
        System.out.println();
        insertFirst(head,5);
        printlist(head);
        System.out.println();
        insertFirst(head,2);
        printlist(head);




    }

    //insert at begining
    static Node insertBegin(Node head,int x){

        Node temp = new Node(x);
        if(head==null)
            temp.next=temp;
        else {
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;
        }

        return temp;

    }

    static class Node {
        int data;
        Node next;
        Node prev;


        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }


    }
    static void printlist(Node head){
        if(head==null)
            return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);

    }
    static Node insertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head==null)
            temp.next=temp;
        else{
            temp.next=head.next;
            head.next=temp;
            int t= temp.data;
            temp.data=head.data;
            head.data=t;
            return temp;

        }



        return head;
    }
    static Node deleteHead(Node head ){
        if(head==null)return null;
        if(head.next==head) return null;
        Node curr=head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next=head.next;
        return curr.next;

    }
    static Node deleeteNth(Node head,int k)
    {
        if(head==null) return head;
        if(k==1)
            return deleteHead(head);
        Node curr = head;
        for (int i = 0; i < k-2; i++) {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

    static Node insertFirst(Node head ,int x){
        Node temp = new Node(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return head;

        
    }

    
}
