package QUESTIONS;

public class lickedlistcycle {
    public static void main(String[] args) {

    }
    public boolean hascycle(listnode head){
        listnode fast=head;
        listnode slow=head;

        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }

        }
        return false;

    }
    class listnode {
        int val;
        listnode next;
        public listnode(){

        }
        listnode(int x){
            val=x;
            next=null;
        }
    }
}
