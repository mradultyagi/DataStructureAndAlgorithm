import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int arr[] ={1,89,3,4,5};
//        delete(arr,arr.length,3);
//        System.out.println(sorted(arr,arr.length-1));
//        int n=arr.length;
//        reverse(arr,n);
//        removeduplicate(arr,arr.length);
//        leftrotate3(arr,arr.length,3);
        leader(arr,arr.length);
    }
    public static int[] delete(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n)
            return arr;
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        int[] arr2 = new int[n - 1];
        System.arraycopy(arr, 0, arr2, 0, n - 1);
        return arr2;
    }
    public static void largestinarray(int[] arr){
        int max=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max = i;
            }

        }
        System.out.println(max);
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==max){
//                System.out.println(i);
//            }
//
//    }




}
static int secondlargest(int[] arr,int n) {
    int res = -1;
    int largest = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] > largest) {
            res = largest;
            largest = i;
        } else if (arr[i] != arr[largest]) {
            if (res == -1 || arr[i] > arr[res]) {
                res = i;
            }

        }

    }
    return res;

}
static boolean sorted(int[] arr,int n){
    for (int i = 1; i <= n; i++) {
        if(arr[i]<arr[i-1])
            return false;
    }
    return true;
}
static void reverse(int arr[],int n){
        int low=0;
        int high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr));
}
    static int[] removeduplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return arr;
        }

        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        // Create a new array with the length of unique elements
        int[] uniqueArray = new int[res];
        for (int i = 0; i < res; i++) {
            uniqueArray[i] = arr[i];
        }

        return uniqueArray;
    }
    static void leftrotate1(int[] arr,int n){
        int temp=arr[0];
        for (int i = 1; i <n ; i++) {
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;

    }
    static void leftrotate2(int[] arr,int n,int d){
        for (int i = 0; i < d; i++) {
            leftrotate1(arr,n);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void leftrotate3(int arr[],int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int [] arr,int low,int high){
        while(low<high){
            swap(arr,low,high);
            low++;
            high--;
        }

    }
    static void swap(int [] arr,int a,int b){
        int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
    }
    static void leader(int arr[], int n){
        int cr = arr[n-1];
        System.out.print(cr);
        System.out.print(" ");
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]>cr) {
                cr = arr[i];
                System.out.print(cr);
                System.out.println(",");
            }


        }


    }

}
