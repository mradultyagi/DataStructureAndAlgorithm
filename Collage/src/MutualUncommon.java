import java.util.HashMap;
import java.util.HashSet;

public class MutualUncommon {
    public static void main(String[] args) {
        int[] arr1={2,3,4,3,8,99};
        int[] arr2={2,3,4,3,8,9};
        System.out.println(product(arr1,arr2));;


    }
    static int product(int [] arr1,int[] arr2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int x:arr1){
            set1.add(x);
        }
        for(int y :arr2){
            set2.add(y);
        }
        HashSet<Integer> unq1 = new HashSet<>();
        unq1.removeAll(set2);

        HashSet<Integer> unq2 = new HashSet<>();
        unq2.removeAll(set2);

        int c1=unq1.size();
        int c2 = unq2.size();
        return c1*c2;
    }
}
