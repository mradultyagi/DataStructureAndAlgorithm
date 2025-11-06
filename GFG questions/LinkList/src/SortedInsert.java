import java.util.ArrayList;
import java.util.Arrays;

public class SortedInsert {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        // Example usage:
        head = sortedinsert(head, 25);     // Inserts 25 in sorted position
        printlist(head);                   // Print the list after insertion
        System.out.println();

        findmiddle(head);                 // Find and print the middle node
        Nthfromend(head, 5);              // Print the 5th node from end (method 1)
        Nthfromend2(head, 5);             // Print the 5th node from end (method 2)

        head = reverse(head);             // Reverse the list (by data)
        printlist(head);                  // Print reversed list
    }

    static   Node sortedinsert(Node head,int x){
        Node temp = new Node(x);
        if(head==null) return temp;
        if(x<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while (curr.next!=null &&curr.next.data<x  ){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
  }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    static void printlist(Node head) {
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
    static void findmiddle (Node head){
        if(head==null) return;
        Node slow=head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow);
    }
    static void Nthfromend(Node head,int x){
        int len =0;
        for (Node curr=head;curr!=null;curr = curr.next) {
            len++;
        }
        if(len<x) return;
        Node curr = head;
        for (int i = 0; i < len-x; i++) {
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    //two pionter
    static void Nthfromend2(Node head,int n){
        Node first = head;
        for (int i = 0; i < n; i++) {
            if(first == null) return;
            first=first.next;
        }
        Node second = head;
        while(first != null){
            second=second.next;
            first=first.next;
        }
        System.out.println(second.data);
    }
    static Node reverse(Node head){
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for(Node curr = head ;curr!=null;curr=curr.next){
//            arr.add(curr.data);
//        }
//        int i= arr.size()-1;
//        for(Node curr = head;curr!=null;curr=curr.next)
//            curr.data=arr.get(i--);
//        //method 2
        Node curr=head;
        Node prev=null;
        while (curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

      return prev;
    }
    static Node Rreverse(Node head){
        if(head==null || head.next==null)return null ;
        Node rest_head = Rreverse(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    static Node removeduplicate(Node head){
        

        return head;
    }
}
