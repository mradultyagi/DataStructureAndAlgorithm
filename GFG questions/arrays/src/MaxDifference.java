public class MaxDifference {
    public static void main(String[] args) {
        int [] arr={2,3,4,2,31,32,200};
        int n= arr.length;
        maxdiff(arr,n);
    }

    static void maxdiff(int [] arr,int n){
        int res = arr[1]-arr[0];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        System.out.println(res);
    }
}
