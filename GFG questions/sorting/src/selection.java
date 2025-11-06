import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int arr[]={7,6,6,6,5,4,3,2};
        selection(arr);

    }
    static void selection(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j])
                    swap(arr,i,j);

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
