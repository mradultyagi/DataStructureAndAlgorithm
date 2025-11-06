import java.util.HashMap;
import java.util.*;

public class frequency {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        freq(arr, n);

    }
    static void freq(int arr[], int n){
        HashMap <Integer,Integer> fre = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if(fre.containsKey(arr[i]))
            {
                fre.put(arr[i],fre.get(arr[i])+1);
            }
            else {
                fre.put(arr[i],1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : fre.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
