import java.util.*;

public class arraylistreturntype {
    public static void main(String[] args) {
        int [] arr={2,3,32,2,3,3,1,23,23,21};
        int target=3;
        System.out.println(search(arr,target,0,new ArrayList<>()));


    }
    static ArrayList<Integer> search(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }

}
