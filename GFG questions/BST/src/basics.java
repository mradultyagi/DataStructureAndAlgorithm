public class basics {
    static class Node {
        int key;
        Node left,right;

        public Node(int key) {
            this.key = key;
        }
    }
    static void inorder (Node root){
        if(root !=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left=new Node(20);
        root.right =  new Node(30);
        root.right.left = new Node(40);
        root.right.right= new Node(50);
        inorder(root);


    }




}
