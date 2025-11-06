public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={2,3,32,21,23,23,21};
        int target=3;
        System.out.println(search(arr,target,0));
        System.out.println(index(arr,target,0));

    }
    static boolean search(int[] arr,int target,int index){
       if(index==arr.length-1){
           return false;
       }
       return arr[index]==target|| search(arr, target, index+1);
    }
    static int index(int[] arr,int target,int index){
        // System.out.println("Index Of Element Is");
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return index(arr, target, index+1);
        }

    }

}
