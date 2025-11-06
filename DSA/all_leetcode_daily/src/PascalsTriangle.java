import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of lines");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces=n;
        int number=1;
        for (int i = 0; i < n ; i++){
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            number=1;
            for (int k = 0; k <=i ; k++) {
                System.out.print(number+" ");
                number=number*(i-k)/(k+1);

            }
            System.out.println();
            spaces--;


        }
    }
}
