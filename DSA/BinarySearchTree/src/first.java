import java.util.*;
public class first {


    // Renaming the class to 'Node' and adding a constructor
    private static class Node {
        int value;
        Node left;
        Node right;

        // Constructor to initialize the node with a value
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    public void populate (Scanner sc){
        System.out.println("ENter the node");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    private void  populate (Scanner sc,Node node){
        System.out.println("you want enter left of" + node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter value of left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        System.out.println("you want enter right of" + node.value);

        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter value of right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent );
        display(node.right , indent );
    }



}
