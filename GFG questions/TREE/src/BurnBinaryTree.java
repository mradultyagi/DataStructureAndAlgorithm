import org.w3c.dom.Node;

public class BurnBinaryTree {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left = new Basics.Node(20);
        root.right = new Basics.Node(30);
        root.left.left = new Basics.Node(40);
        root.left.right = new Basics.Node(50);
        root.right.right = new Basics.Node(60);
        root.left.right.left = new Basics.Node(70);
        root.left.right.right = new Basics.Node(80);

        int target = 50;
        burnTime(root, target);
        System.out.println("Total time to burn the tree: " + res);

    }
    static int res =0;

    static int burnTime(Basics.Node root,int target){
        if(root == null ) return -1;
        if(root.key == target){
            burnsubTree(root,0);
            return 0;
        }
        int leftdist = burnTime(root.left,target);
        if(leftdist != -1){
            burnsubTree(root.left,leftdist+1);
            res = Math.max(res,leftdist+1);
            return leftdist+1;
        }
        int rightdist=burnTime(root.right,target);
        if(rightdist != -1){
            burnsubTree(root.right,rightdist+1);
            res= Math.max(res,rightdist+1);
            return rightdist+1;
        }
        return -1;
    }
    static void burnsubTree(Basics.Node root,int time){
        if(root==null) return ;
        res=Math.max(res,time);
        burnsubTree(root.left,time+1);
        burnsubTree(root.right,time+1);


    }


}
