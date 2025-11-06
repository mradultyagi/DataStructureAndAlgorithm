import java.util.Arrays;

public class inplaceMergeSort {
    public static void main(String[] args) {
        int[] arr1={4,5,3,2,43,99};
        inplaceMergeSort(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));

    }

    static void inplaceMergeSort(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid= (s+e) /2;
        inplaceMergeSort(arr,s,mid);
        inplaceMergeSort(arr,mid,e);
        mergeinplace(arr,s,mid,e);
    }

    private static void mergeinplace(int[] arr,int s,int m,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j <e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }

    }
}
