public class QuickSort {


    static int partition(int[] arr, int low, int high) {

        int pidx = arr[high];
        int i = low - 1;
        for (int j = 0; j < high; j++) {
            if (arr[j] < pidx) {
                i++;
                swap(arr, i, j);
            }
            i++;
            swap(arr, i, high);
        }
        swap(arr,i,high);
        return i;


    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);


        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 3, 2, 4, 3};
        System.out.println("quick sorting");
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

        }
    }

}