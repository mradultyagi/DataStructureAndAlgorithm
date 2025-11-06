import java.util.Arrays;

public class movezeroes {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        movezero(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void movezero(int [] arr){
        int n= arr.length;
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0 ){
                swap(arr,i,j);
                j++;
            }
        }

    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
