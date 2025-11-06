import java.util.Scanner;

public class matrixinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int coloumns= sc.nextInt();
        int[][]arr=new int [r][coloumns];
        int value =1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < coloumns; j++) {
                int n= sc.nextInt();
                arr[i][j]=n;

            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < coloumns; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }



    }
}
