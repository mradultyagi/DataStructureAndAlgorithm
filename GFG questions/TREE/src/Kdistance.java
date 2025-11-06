public class Kdistance {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left=new Basics.Node(20);
        root.right =  new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right= new Basics.Node(50);

    }
    void printAtK(Basics.Node root,int k){
        if(root ==  null) return;
        if(k==0) System.out.println(root);
        else {
            printAtK(root.left,k-1);
            printAtK(root.right,k+1);
        }

    }
}
