public class delete {
    public static void main(String[] args) {
        basics.Node root = new basics.Node(10);
        root.left=new basics.Node(20);
        root.right =  new basics.Node(30);
        root.right.left = new basics.Node(40);
        root.right.right= new basics.Node(50);
        DeleteNode(root,20);

    }
    static basics.Node DeleteNode(basics.Node root,int x){
        if(root == null) return null;
        if(root.key>x)
            root.left=DeleteNode(root.left,x);
        else if (root.key<x)
            root.right=DeleteNode(root.right,x);
        else
            if (root.left == null) return root.right;
            else if (root.right==null) return root.left;
            else {
                basics.Node succ = getSucc(root);
                root.key = succ.key;
                root.right=DeleteNode(root.right,succ.key);
                
            }
            return root;
    }
    static basics.Node getSucc(basics.Node root){
        basics.Node curr = root.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }
}
