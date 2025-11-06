import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int arr[]={7,6,6,6,5,4,5,2,2,4,6,67,98,3,2};
        insertionsort(arr);
    }
    static void insertionsort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr,j-1,j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int a,int b){
        int j =arr[a];
        arr[a]=arr[b];
        arr[b]=j;
    }
}
