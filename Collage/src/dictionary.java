import java.util.*;
import java.util.HashMap;
import java.util.Hashtable;

public class dictionary {
    public static void main(String[] args) {
//        Dictionary<String,Integer> d = new Hashtable<>();
//        d.put("a",23);
//        d.put("b",27);
//        d.put("c",70);
//        System.out.println(d);
//        System.out.println("value of b "+d.get("b"));
       int [] arr={1,1,1,2,2,3,4,4,4,4,4,'A','A'};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num :arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }


}
