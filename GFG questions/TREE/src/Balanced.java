public class Balanced {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left=new Basics.Node(20);
        root.right =  new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right= new Basics.Node(50);
        System.out.println(isbalance(root));

    }
    //height diff be left and right subtree is smaller or equal to 1

    static boolean isbalance(Basics.Node root){
        if(root == null) return true;
        int lh = Height.height(root.left);
        int rh = Height.height(root.right);
        return (Math.abs(lh-rh)<=1 && isbalance(root.right)&& isbalance(root.left));

    }

    //Optimised solution
    static int balance(Basics.Node root){
        if(root == null ) return  0;
        int lh = balance(root.left);
        if( lh == -1) return -1;
        int rh = balance(root.right);
        if(rh == -1) return -1;
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh,rh) +1;

    }
    static boolean BALANCED(Basics.Node root){
        return balance(root) !=-1;
    }

}
