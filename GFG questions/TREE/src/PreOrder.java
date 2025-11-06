public class PreOrder {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left=new Basics.Node(20);
        root.right =  new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right= new Basics.Node(50);
        preorder(root);
    }
    static void preorder (Basics.Node root){
        if(root !=null){

            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }

    }

}
