
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        List<List<Integer>> ans =subarrayduplicate(arr);
        for(List<Integer> List:ans){
            System.out.println(List );
        }

    }
    static List<List<Integer>> subarrays(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for( int num:arr){
            int n= outer.size();
            for (int i = 0; i < n ; i++) {
                List<Integer> inner=new ArrayList<Integer>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }

        }
        return outer;
    }
    static List<List<Integer>> subarrayduplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end =0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            //agar current and pichla element same aa jaye

            if(i > 0 &&  arr[i]==arr[i-1]){
                start=end+1;
            }

            end = outer.size()-1;
            int n= outer.size();
            for (int j = start; j < n; j++) {


                List<Integer> inner=new ArrayList<Integer>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }

        }
        return outer;
    }
}
