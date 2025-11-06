import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int arr[]={5,2,4,2,8};
        bubblesort(arr, arr.length);

    }
    public static void bubblesort(int arr[],int n){
        for (int j = 0; j <n-1 ; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
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
