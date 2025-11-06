import java.util.ArrayList;
import java.util.Arrays;

//preorder approach is used

public class SerializeDserialize {
    public static void main(String[] args) {
        Basics.Node root = new Basics.Node(1);
        root.left = new Basics.Node(2);
//        root.right = new Basics.Node(3);
//        root.left.left = new Basics.Node(4);
//        root.left.right = new Basics.Node(5);
//        root.right.left = new Basics.Node(6);
//        root.right.right = new Basics.Node(7);
        ArrayList<Integer> a=new ArrayList<>();
        serialize(root,a);
        System.out.println(a);

    }
    static void serialize(Basics.Node root, ArrayList<Integer> arr){
        if(root==null){
            arr.add(null);
            return;
        }
        arr.add(root.key);
        serialize(root.left,arr);
        serialize(root.right,arr);
//        System.out.println(Arrays.toString(arr));

    }
    static int index=0;
    static Basics.Node deserialize(ArrayList<Integer> arr){
        if(index == arr.size()) return null;
        int val = arr.get(index);
        index++;
        if(val == -1) return null;
        Basics.Node root = new Basics.Node(val);
        root.left=deserialize(arr);
        root.right=deserialize(arr);

    return root;
    }

}
