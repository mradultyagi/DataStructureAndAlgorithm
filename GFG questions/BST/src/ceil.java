public class ceil {
    public static void main(String[] args) {
        basics.Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);



    }
    static basics.Node insert(basics.Node root, int key){
        if(root == null) return new basics.Node(key);
        if(root.key>key){
            root.left= insert(root.left,key);
        }
        else {
            root.right= insert(root.right,key);
        }
        return root;
    }
    static basics.Node ceil(basics.Node root, int x){
        basics.Node res = null;
        while (root != null ){
            if(root.key == x){
                return root;
            } else if (root.key<x) {
                root=root.right;
            }
            else {
                res=root;
                root=root.left;
            }
        }
        return res;
    }
}
