public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int arr [] = {2,3,-8,7,-1,2,3};
        int arr1[] ={5,8,3};
        int n= arr1 .length;
        System.out.println(maxsum2(arr,n));
    }
    static int maxsum(int arr[],int n){
        int res=arr[0];
        for (int i = 0; i < n; i++) {
            int curr=0;
            for (int j = i; j < n; j++) {
                curr +=arr[j];
            }
            res=Math.max(res,curr);
        }
        return res;
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

}
