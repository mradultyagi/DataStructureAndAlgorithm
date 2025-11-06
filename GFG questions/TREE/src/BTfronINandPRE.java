public class BTfronINandPRE {
    public static void main(String[] args) {

    }
    static int preIndex = 0;
    static Basics.Node cTree(int in[] ,int[] pre,int is,int ie){
        if(is>ie) return null;
        Basics.Node root = new Basics.Node(pre[preIndex++]);
        int inIndex = -1 ;
        for (int i = is; i <= ie; i++) {
            if(in[i] == root.key){
                inIndex =i;
                break;
            }
        }
        root.left=cTree(in,pre,is,inIndex-1);
        root.right=cTree(in,pre,inIndex+1,ie);
        return root;



    }
}
