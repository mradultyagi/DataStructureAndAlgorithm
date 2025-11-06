public class MaxOddEven {
    public static void main(String[] args) {
        int arr [] = {5,10,20,6,3,8};
        int arr1[] ={5,8,3};
        int n= arr1 .length;
        System.out.println(maxlength(arr,n));

    }
    static int maxlength(int arr[],int n){
        int res =1;
        for (int i = 0; i < n; i++) {
            int curr=1;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]%2==0 && arr[j-1]==1 || arr[j]%2==1 && arr[j-1]==0){
                    curr++;
                }
                else
                    break;
            }
            res=Math.max(curr,res);
        }
        return res;
    }
    static int max(int arr[] , int n){
         int curr=1;
         int res=1;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0 && arr[i-1]==1 || arr[i]%2==1 && arr[i-1]==0){
                curr++;
                res =Math.max(res,curr);
            }
            else curr = 1;
        }
        return res;
    }
}
