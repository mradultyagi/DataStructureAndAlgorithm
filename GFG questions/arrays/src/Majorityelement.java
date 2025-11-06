import java.util.HashMap;

public class Majorityelement {
    public static void main(String[] args) {
        int arr[] = {8,3,4,8,8};
        majority_element(arr, arr.length);

    }

    static void majority_element(int arr[], int n) {
        HashMap<Integer, Integer> me = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (me.containsKey(arr[i])) {
                me.put(arr[i], me.get(arr[i] )+ 1);
            } else {
                me.put(arr[i], 1);
            }
        }
        int majorityelement = -1;
        int maxcount = 0;
        for (HashMap.Entry<Integer, Integer> mapElement : me.entrySet()) {


            // Adding some bonus marks to all the students
            int value = mapElement.getValue();
            if(value >= arr.length/2){
                int key = mapElement.getKey();
//                majorityelement=key;
//                maxcount = value;
//                break;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == key){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
