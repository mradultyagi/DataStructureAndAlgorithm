public class kthSmallest {
    public static void main(String[] args) {
        basics.Node root = new basics.Node(30);
        root.left = new basics.Node(20);
        root.right = new basics.Node(40);
        root.left.left = new basics.Node(10);
        root.right.left = new basics.Node(35);
        root.right.right = new basics.Node(50);
        KthSmallestInBst(root,1);
        System.out.println(res);

    }
    static int count=0;
    static int res =-1;
    static void KthSmallestInBst(basics.Node root , int k){
        if(root==null) return;
        KthSmallestInBst(root.left,k);
        count++;
        if(count==k){
            res=root.key;
        }
        KthSmallestInBst(root.right,k);
    }
}
