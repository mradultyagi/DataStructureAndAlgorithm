//import java.lang.reflect.Array;
import java.util.ArrayList;

public class ALLSEQUENCEOFSTRING {
    public static void main(String[] args) {
//        sequence("" , "abc");
        System.out.println(sequenceARRAYLIST("","abcd"));
    }
//    static void sequence(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch =up.charAt(0);
//        sequence(p,up.substring(1));
//        sequence(p+ch,up.substring(1));
//
//    }
    static ArrayList<String> sequenceARRAYLIST(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> left =sequenceARRAYLIST(p,up.substring(1));
        ArrayList<String> right=sequenceARRAYLIST(p+ch,up.substring(1));
        left.addAll(right);
        return left;

    }

}
