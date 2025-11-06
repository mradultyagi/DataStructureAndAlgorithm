import java.util.Arrays;

public class revise {
    public static void main(String[] args) {

    }
    boolean panagram (String str){
        int x=str.length();
        if(x<26){
            return false;
        }
        boolean visited []= new boolean[26];
        for (int i = 0; i < x; i++) {
            char n= str.charAt(i);
            if(n>='a' && n<='z'){
                visited[n-'a']=true;
            }
            if(n>='A' && n<='Z'){
                visited[n-'a']=true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(visited[i]==false){
                return false;
            }
        }
       
    return true;
    }

    static char extrachar(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        int n = c1.length;

    }
}
