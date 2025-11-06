import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class balancedParanthesis {
    public static void main(String[] args) {
        String str="(()){}[{()}]";
        String str2="(";
        check(str);
        System.out.println(check(str));

    }
    static boolean check(String str){
        //used arrardeque instead of stack bcz dosent cause extra overhead
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            }
            else{
                if(s.isEmpty()==true){
                    return false;
                } else if (Matching(s.peek(),x)==false) {
                    return false;
                }
                else {
                    s.pop();
                }

            }

        }
        return (s.isEmpty()==true);
    }
    static boolean Matching(char a,char b){
        return((a=='(' && b==')') ||(a=='[' && b==']')||(a=='{' && b=='}'));
    }
}
