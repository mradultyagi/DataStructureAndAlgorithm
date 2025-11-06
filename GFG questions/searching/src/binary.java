import java.util.Arrays;

public class binary {
    public static void main(String[] args) {
        int arr[] ={2,4,6,64,1,765,456,43,99};
        int n=2;
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,n));
    }
}
