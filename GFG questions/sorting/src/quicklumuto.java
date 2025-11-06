import java.util.Arrays;

public class quicklumuto {
    public static void main(String[] args) {
        int [] arr={2,6,3,7,4,2};
        qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static int position (int [] arr,int s,int e){

        int pivot = arr[e];
        int i=s-1;
        for (int j = s; j < e; j++) {
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,e);
        return i+1;

    }
    static void qsort(int [] arr,int s,int e){
        if(s<e){
            int p=position(arr,s,e);
            qsort(arr,s,p-1);
            qsort(arr,p+1,e);

        }
    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
