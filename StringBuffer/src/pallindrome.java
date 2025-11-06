import java.util.Scanner;
import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        sb.append(scanner.nextLine());
        System.out.println(sb);
        if(sb == sb.reverse()){
            System.out.println("pallindrome");
        }
    }
}
