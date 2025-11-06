import java.util.*;
public class string {
    public static void main(String[] args) {
        System.out.println();
        String s1 = "Hello";
        String s2 = "heLLo";
        //operations on string
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.toUpperCase());
       // System.out.println(s1.capitalize());
        //SLICING
        System.out.println(s1.substring(2,5));
        //
        StringBuilder sb = new StringBuilder("abcd");
        sb.reverse();
        System.out.println(sb);
        sb.append("efg");
        System.out.println(sb);
        sb.setCharAt(0,'h');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(1,"gfg");
        System.out.println(sb);
    }
}
