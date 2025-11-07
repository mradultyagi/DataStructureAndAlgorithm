import java.util.*;

public class ceil2 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 30, 15, 25, 12};

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.print("Ceilings on left side: ");
        printCeilingsOnLeft(arr);
    }

    static void printCeilingsOnLeft(int [] arr){
        TreeSet<Integer> ts= new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            Integer ceil = ts.ceiling(arr[i]);
            if(ceil==null){
                System.out.println("-1");
            }
            else {
                System.out.println(ceil+" ");
            }
            ts.add(arr[i]);
        }
    }
}
