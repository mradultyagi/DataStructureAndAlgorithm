public class NodeInCompleteBT {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(1);
        root.left = new Basics.Node(2);
        root.right = new Basics.Node(3);
        root.left.left = new Basics.Node(4);
        root.left.right = new Basics.Node(5);
        root.right.left = new Basics.Node(6);
        root.right.right=new Basics.Node(7);
        System.out.println("Total Nodes in Complete BT: " + NodesInBt2(root));


    }
    static int NodesInBt(Basics.Node root){
        if(root == null ) return 0;
        return 1+NodesInBt(root.left)+NodesInBt(root.right);
    }

    static int NodesInBt2(Basics.Node root){
        Basics.Node curr = root;
        int lh =0;
        int rh =0;
        while (curr != null){
            lh++;
            curr=curr.left;
        }
        curr=root;
        while (curr!=null){
            rh++;
            curr=curr.right;
        }
        if (lh==rh){
            return (1<<lh)-1;
        }
        return 1+NodesInBt2(root.left)+NodesInBt2(root.right);
    }
}
