import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultiException {
    static void main(String[] args) {
        try{
            methodA();
            Scanner sc = new Scanner(new File("text.ir"));
            System.out.println("main");
        }
        catch (ArithmeticException ex){
            System.out.println("arithmetic caught...");
        }
        catch (FileNotFoundException ex){
            System.out.println("file not found exception...");
        }

    }
    static void methodA(){
        try {
            System.out.println(1/0);
        }
        finally {
            System.out.println("finally");
        }
    }
}
