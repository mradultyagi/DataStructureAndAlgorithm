import java.util.*;
public class pangramString {
    public static void main(String[] args) {
        String s="qwertyuiopasdfghjklzxcvbnm";
        if(isPanagram(s)){
            System.out.println("panagram");
        }
        else{
            System.out.println("not panagram");
        }
    }
    static boolean isPanagram(String s){
        int l = s.length();
        if(l<26){
            return false;
        }
        boolean visited[] = new boolean[26];
        for (int i = 0; i < 26; i++) {
            char x = s.charAt(i);
            if(x>='a' && x<='z'){
                visited[x-'a']=true;
            }
            if(x>='A' && x<'Z'){
                visited[x-'A'] = true;
            }

        }
        for (int i = 0; i < 26; i++) {
            if(!visited[i]){
                return false;
            }

        }
        return true;
    }

}
