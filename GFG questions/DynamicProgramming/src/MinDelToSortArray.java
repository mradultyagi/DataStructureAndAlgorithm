public class MinDelToSortArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30 };
        int x =deletion(arr);
        System.out.println(arr.length-x);
    }
    static int deletion(int [] arr){
        int n = arr.length;

        int [] lis = new int[n];
        lis[0]=1;
        for (int i = 0; i < n; i++) {
            lis[i]=1;
            for (int j = 0; j < i; j++) {
                if(arr[i]>arr[j]){
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
