public class MaxOfTree {
    public static void main(String[] args) {

                Basics.Node root = new Basics.Node(10);
                root.left = new Basics.Node(20);
                root.right = new Basics.Node(30);
                root.right.left = new Basics.Node(40);
                root.right.right = new Basics.Node(50);
                System.out.println(Max(root));




    }
    static int Max(Basics.Node root){
        if(root == null) return Integer.MIN_VALUE;
        else{
            return Math.max(root.key,Math.max(Max(root.left),Max(root.right)));
        }
    }
}
