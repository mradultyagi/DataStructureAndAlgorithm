public class Bouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 12,7, 7};
        int m = 2;
        int k = 3;
        int ans=garden(bloomDay,k,m);
        System.out.println(ans);

    }

    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length;
        int count = 0;
        int days = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                count++;

            } else {
                days = days + (count / k);
                count = 0;
            }

        }
        days = days + (count / k);
        return days >= m;
    }
    public static int garden(int [] arr,int k,int m){
        if(arr.length<m*k){
            return -1;

        }
        int min=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int low=min;
        int high=max;
        while(low<high){
            int mid =(low+high)/2;
            if(possible(arr,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

}
