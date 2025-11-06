import java.util.Arrays;

public class merge2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;

        int[] arr3 = new int[n1 + n2];
        merge(arr1,arr2,n1,n2,arr3);

    }
    static void merge(int[] arr1,int[] arr2,int n,int m,int [] arr3){
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i < n)
            arr3[k++] = arr1[i++];

        while (j < m)
            arr3[k++] = arr2[j++];

        System.out.println(Arrays.toString(arr3));
    }
}
