import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        try {
            //exception ko pkdega

            Scanner in = new Scanner(new File("txt.in"));
            System.out.println("exit main()");
        }
        catch (FileNotFoundException ex){
            //kya krenge agar try mai ye wali exception aa jati hai toh
            System.out.println("file not found....");
        }
        //optional hai
        //humesha execute krega chahe exception ka status kuch bhi ho
        finally {

            System.out.println("always executed");
        }

        }
}
