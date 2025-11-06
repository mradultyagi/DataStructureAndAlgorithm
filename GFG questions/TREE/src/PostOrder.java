public class PostOrder {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left=new Basics.Node(20);
        root.right =  new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right= new Basics.Node(50);
        post(root);
    }
    static void post (Basics.Node root){
        if(root !=null){
            post(root.left);

            post(root.right);
            System.out.println(root.key);
        }

    }
}
