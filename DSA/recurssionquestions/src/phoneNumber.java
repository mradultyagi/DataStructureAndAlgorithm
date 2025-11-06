import java.util.ArrayList;

public class phoneNumber {
    public static void main(String[] args) {
        System.out.println(pad2("","12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';//convert '12' to 12 means char to int
        for (int i = (digit-1)*3; i < (digit)*3 ; i++) {
            char ch =(char) ('a'+i);
            pad(p+ch,up.substring(1));

        }
    }

    //As array list output
    static ArrayList<String> pad2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ans =new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch=(char) ('a'+i);
            ans.addAll(pad2(p+ch,up.substring(1)));
        }
        return ans;
    }
}
