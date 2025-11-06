public class floor {
    public static void main(String[] args) {

    }
    static basics.Node floor(basics.Node root,int x){
        basics.Node res =null;
        while (root != null){
            if(root.key == x) return root;
            else if(root.key>x)
                root=root.left;
            else {
                res = root;
                root=root.right;

            }

        }
        return res;

    }
}
