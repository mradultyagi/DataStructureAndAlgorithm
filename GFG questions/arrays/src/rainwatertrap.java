public class rainwatertrap {
    public static void main(String[] args) {


    }
    int getWater(int arr[],int n){
        int res=0;
        int lamx=arr[0];
        int rmax=arr[0];
        for (int i = 0; i < n; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lamx=Math.max(lmax,arr[j]);

            }
            for (int j = i+1; j < n; j++) {
                rmax=Math.max(rmax,arr[j]);
            }
            res+=(Math.min(lmax,rmax)-arr[i]);

        }
        return res;
    }
}
