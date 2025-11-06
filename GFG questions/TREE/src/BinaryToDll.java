public class BinaryToDll {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left=new Basics.Node(20);
        root.right =  new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right= new Basics.Node(50);
        Basics.Node head = BTtoDLL(root);
        printList(head);

    }
    //Inplace Conversion an INORDER
    static Basics.Node prev = null;
     static Basics.Node BTtoDLL(Basics.Node root){
        if(root == null ) return null;
        Basics.Node head = BTtoDLL(root.left);
        if(prev == null) head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTtoDLL(root.right);
        return head;
     }
     static void printList(Basics.Node head){
         Basics.Node curr = head;
         while (curr != null){
             System.out.print(curr.key +" ");
             curr=curr.right;
         }
     }
}
