public class LongestIncreasingSubseq {
    public static void main() {
        int [] arr={3,4,2,8,10,5,1};
        System.out.println(LIS(arr,arr.length));

    }
    static int LIS(int[] arr,int n){
        int[] lis= new int[n];
        lis[0]=1;
        for (int i = 0; i < n; i++) {
            lis[i]=1;
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i]){
                    lis[i]=Math.max(lis[i],lis[j]+1);
                }
            }
        }
        int res=0;
        for (int i = 0; i < lis.length; i++) {
            res=Math.max(res,lis[i]);
        }
        return res;
    }
}
