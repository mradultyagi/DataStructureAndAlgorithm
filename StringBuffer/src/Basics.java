import java.math.BigInteger;
import java.util.Random;
import java.util.Arrays;
import java.text.DecimalFormat;


public class Basics {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());
//        StringBuffer sb2=new StringBuffer("mradul tyagi");
//        System.out.println(sb2.capacity());
//        StringBuffer sb3=new StringBuffer(30);
//        System.out.println(sb3.capacity());
////        append
//        sb2.append(" hii");
//        System.out.println(sb2);
//        // replace
//        sb2.replace(1,3,"hello");
//        System.out.println(sb2);
//        //insert
//        sb.append("my name is khan");
//        sb.insert(1,"me");
//        System.out.println(sb);
//        //delete
//        sb.delete(3,5);
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        //rando ka istmaal
////        Random random = new Random();
////        StringBuffer sb4 = new StringBuffer(10);
////        for (int i = 0; i < sb.capacity(); i++) {
////            int randomchar=97+(int)(random.nextFloat() * 26);
////            sb.append((char)randomchar);
////        }
////        System.out.println(sb4.toString());
//
//        //removing white spaces or anything else
//        String s="vb kdjs  ksj n ljd mnvkd jk";
//        System.out.println(s.replace(" ",""));
//        //splitting
//        String arr ="tyagi yadav jaat sharma saini saxena";
//        String[] names = arr.split(",");
//        System.out.println(Arrays.toString(names));
//        //round off
//        DecimalFormat df = new DecimalFormat("0.00000");
//        System.out.println(df.format(7.28));

        BigInteger A = BigInteger.valueOf(5);
        BigInteger B = BigInteger.valueOf(6);//conver int/long to BI
        int c =B.intValue();//conver Bi ti int
        BigInteger C = new BigInteger("2345645678987654");
        BigInteger D = new BigInteger("98765789876545678909");

        //Constants
        BigInteger E = BigInteger.TEN;

        //add same for multiplt divaide and sutraction
        BigInteger s = C.add(D);
        System.out.println(s);

        BigInteger rem = C.remainder(D);
        System.out.println(rem);

        if(C.compareTo(D)<0){
            //yes if c is smaller than d
            System.out.println("YES");
        }



    }
}
