import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 24, 7, 844, 3, 7};
        int l = 0;
        int r = arr.length - 1;

        mergesort(arr, l, r);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void mergesort(int arr[], int l, int r) {
        if (l < r) { // Use this condition to avoid infinite recursion
            int m = l + (r - l) / 2;
            mergesort(arr, l, m);     // Sort first half
            mergesort(arr, m + 1, r); // Sort second half
            merge(arr, l, m, r);      // Merge the sorted halves
        }
    }

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays back into arr[l..r]
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
