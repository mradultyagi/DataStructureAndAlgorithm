import java.util.ArrayList;

//can go diagonally also
public class mazeproblem2 {
    public static void main(String[] args) {
        System.out.println(path("",3,3));

    }
    static ArrayList path(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll( path(p+'V',r-1,c));
        }
        if(c>1){
            ans.addAll( path(p+'H',r,c-1));
        }
        if(r>1&&c>1){
            ans.addAll( path(p+'D',r-1,c-1));
        }
        return ans;

    }

}
