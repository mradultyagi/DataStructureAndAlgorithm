import java.util.HashSet;
import java.util.Scanner;

public class sumofunique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        HashSet<Integer> unique = new HashSet<>();
        for(int num :arr){
            unique.add(num);
        }
        int sum =0;
        for(int num : unique){
            sum+=num;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is"+unique.size());
        sc.close();
    }
}
