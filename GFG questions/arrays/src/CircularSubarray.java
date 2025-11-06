public class CircularSubarray {
    public static void main(String[] args) {
        int arr[]= {-5,-3};
        System.out.println(sum(arr,arr.length));

    }
    static int maxsum2(int arr[],int n){
        int maxEnding= arr[0];
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    static int sum(int arr[] , int n){
        int res=arr[0];
        int max_normal = maxsum2(arr,n);
        if(max_normal<0)
            return max_normal;
        int arr_sum=0;
        for (int i = 0; i < n; i++) {
            arr_sum+=arr[i];
            arr[i]=-arr[i];


        }
        int max_circular = arr_sum + maxsum2(arr,n);
        return  Math.max(max_normal,max_circular);

    }

}
