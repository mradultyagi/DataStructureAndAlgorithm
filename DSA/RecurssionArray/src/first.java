public class first {
    //TO FIND IF ARRAY IS SORTED OR NOT
    public static void main(String[] args) {
        int [] arr={3,4,6,2,1};
        System.out.println(sortedornot(arr,0));

    }
    static boolean sortedornot(int[] arr,int index){
        //BASE CONDITION
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedornot(arr,index+1);
    }
}
