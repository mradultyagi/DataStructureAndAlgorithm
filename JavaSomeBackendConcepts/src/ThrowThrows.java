import java.util.Scanner;

public class ThrowThrows {
    static void main(String[] args) {
        try {
            methodD();
            System.out.println("Exit TRY of main()");
        }
        catch (ArithmeticException e){
            System.out.println("Arithimatic exception ....");
            e.printStackTrace();
        }
        System.out.println("Exit main() successfolly...");

    }
    public static void methodD() throws ArithmeticException{
        int a=5,c;
        int b;
        Scanner sc = new Scanner(System.in);
        b=sc.nextInt();
        if(b==0)
            throw new ArithmeticException();
        else
            c = a/b;
        System.out.println("Exit metdodD");


    }
}
