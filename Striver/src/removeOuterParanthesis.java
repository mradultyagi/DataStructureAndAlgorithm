import java.lang.reflect.Array;
import java.util.Stack;
import java.util.*;
import java.util.Arrays;

public class removeOuterParanthesis {
    public static void main(String[] args) {
        String s = "(()()())()(()()())";
//        System.out.println(removeOuterParentheses(s));
        String r="the sky is blue";
//        System.out.println(reverseWords(r));
        String num ="3333";
        System.out.println(largestOddNumber(num));
    }
//    public static String removeOuterParentheses(String s) {
//        char[]  S =s.toCharArray();
//        String ans="";
//
//        Stack<Character> t =new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            if(t.isEmpty() && s.charAt(i)=='('){
//                t.push(s.charAt(i));
//            } else if (!t.isEmpty() && s.charAt(i)=='(') {
//                t.push(s.charAt(i));
//                ans=ans+'(';
//            } else if (t.size() >1 &&  s.charAt(i)==')') {
//                t.pop();
//                ans=ans+')';
//            }
//            else if (t.size() ==1 &&  s.charAt(i)==')'){
//                t.pop();
//
//            }
//        }
//        int count =0;
//        String ans ="";
//        for (int i = 0; i < s.length(); i++) {
//           if( s.charAt(i) == '('){
//               if(count ==0 ){
//                   count++;
//               }
//               else if (count >0 ) {
//                   ans=ans + '(';
//                   count++;
//               }
//           }
//           else if ( s.charAt(i)==')') {
//               if (count == 1) {
//                   count--;
//               }
//               else if (count > 1) {
//                   ans = ans + ')';
//                   count--;
//               }
//           }
//        }
//        return ans;
//
//
//    }
//    public static String reverseWords(String s) {
//       String word= s.trim().split(" ");
//       StringBuilder sb = new StringBuilder();
//        for (int i = word.length(); i >=0 ; i--) {
//            if(word[i].length()>0){
//                sb.append(word[i]);
//                sb.append(" ");
//            }
//        }
//        return sb.substring(0,sb.length() -1 ).toString();
//}

    public static String largestOddNumber(String s ) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            String n = "";
            for (int j = i+1; j <= s.length(); j++) {
                n=s.substring(i,j);
                int x = Integer.parseInt(n);
                arr.add(x);
            }
        }
        int max =0;
        for (int i = 0; i < arr.size(); i++) {

            if(arr.get(i)%2!=0 && arr.get(i)>max){
                max=arr.get(i);

            }

        }

        if(max==0){
            return "";
        }
        else{
            String str = Integer.toString(max);
            return str;
        }

    }

}
