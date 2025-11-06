import java.util.Stack;

public class Inorder {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left=new Basics.Node(20);
        root.right =  new Basics.Node(30);
        root.right.left = new Basics.Node(40);
        root.right.right= new Basics.Node(50);
        inorder2(root);
    }
    static void inorder (Basics.Node root){
        if(root !=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }

    }
    //iterative solution
    static void inorder2(Basics.Node root){
        if(root==null) return;
        Stack<Basics.Node> s = new Stack<>();
        Basics.Node curr = root;
        while (curr !=null || s.isEmpty() == false){
            while (curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.key);
            curr=curr.right;

        }
    }
}
