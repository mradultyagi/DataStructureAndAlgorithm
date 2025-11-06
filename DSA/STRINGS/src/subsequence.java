import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class subsequence {
    static List<String> a1 = new ArrayList<>();
    public static void main(String[] args) {
        isvalidshuffle("abc","def","dabecf");

        String s ="abcd";
//        finndsubseq(s,"");
//        System.out.println(a1);


    }
    private static void finndsubseq(String s,String ans){
//        if(s.length()==0){
//            a1.add(ans);
//            return;
//        }
//        finndsubseq(s.substring(1),ans+s.charAt(0));
//        finndsubseq(s.substring(1),ans);

    }

    public static boolean isvalidshuffle(String s1,String s2,String s3){
        if(s1.length()+s2.length() != s3.length()){
            return false;
        }
        char [] st1= s1.toCharArray();
        char [] st2=s2.toCharArray();
        char [] st3 = s3.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);
        Arrays.sort(st3);

        int i=0,j=0,k=0;
        while (k<st3.length){
            if(i<st1.length && st3[k] == st1[i]){
                i++;
            }
            else if(j<st2.length && st3[k] == st2[j]){
                j++;
            }
            else {
                return false;
            }
            k++;
        }

        return  i==st1.length && j==st2.length;

    }


}
