public class Height {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left=new Basics.Node(20);
        root.right =  new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right= new Basics.Node(50);
        System.out.println(height(root));

    }
    static int height(Basics.Node root){
        if(root ==  null){
            return 0;
        }
        else
            return Math.max(height(root.left),height(root.right))+1;
    }
}
