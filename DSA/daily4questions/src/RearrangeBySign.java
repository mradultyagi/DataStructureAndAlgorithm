import java.util.*;
public class RearrangeBySign {
    public static void main(String[] args) {
        int arr [] ={1,-2,-7,-2,5,-3,9,3,1,-5};
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < n/2; i++) {
            ans.add(pos.get(i));
            ans.add(neg.get(i));

        }
        System.out.println(ans);



    }

    //optimal
}
