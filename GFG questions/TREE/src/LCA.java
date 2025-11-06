import java.util.ArrayList;

public class LCA {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(10);
        root.left = new Basics.Node(20);
        root.right = new Basics.Node(30);
        root.left.left = new Basics.Node(40);
        root.left.right = new Basics.Node(50);
        root.right.left = new Basics.Node(60);
        root.right.right = new Basics.Node(70);

        System.out.println(lca(root,40,50).key);

    }
    static Basics.Node lca(Basics.Node root, int n1, int n2){
        ArrayList<Basics.Node> path1= new ArrayList<>();
        ArrayList<Basics.Node> path2 = new ArrayList<>();
        if(!findpath(root, path1, n1) || !findpath(root, path2, n2)){
            return null;
        }
        for (int i = 0; i <path1.size()-1 && i<path2.size()-1 ; i++) {
            if(path1.get(i+1)!=path2.get(i+1)){
                return path1.get(i);
            }

        }
        return null;

    }
    static boolean findpath(Basics.Node root, ArrayList<Basics.Node> path,int n){
        if(root == null) return false;
        path.add(root);
        if(root.key == n ) return true;
        if(findpath(root.left,path,n) || findpath(root.right,path,n))
            return true;
        path.remove(path.size()-1);
        return false;
    }
}
