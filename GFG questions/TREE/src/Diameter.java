public class Diameter {
    public static void main(String[] args) {

    }
    static int diameter(Basics.Node root){
        if(root == null) return 0;
        int d1= 1+heigth(root.left)+heigth(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1,Math.max(d2,d3));
    }
    static int res =0;
    static int heigth(Basics.Node root){
        if(root == null ) return 0;
       int lh = heigth(root.left);
       int rh = heigth(root.right);
       res = Math.max(res,1+lh+rh);
       return 1+Math.max(lh,rh);
    }
}
