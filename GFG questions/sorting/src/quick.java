import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int [] arr={2,6,3,7,4,2};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    static void qs(int [] arr,int low,int high){

        if(low<high){
           int pi= partition(arr,low,high);
           qs(arr,low,pi-1);
           qs(arr,pi+1,high);
        }
    }
    static int partition (int arr[], int low, int high)
    {
        int pivot = arr[high];    // pivot
        int i = (low - 1);  // Index of smaller element

        for (int j = low; j <= high- 1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;    // increment index of smaller element
                swap(arr,arr[i], arr[j]);
            }
        }

        swap(arr,arr[i + 1], arr[high]);
        return (i + 1);
    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
