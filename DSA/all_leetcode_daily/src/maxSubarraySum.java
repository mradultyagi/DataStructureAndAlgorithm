class maxSubarraySum {
    public static int maxSubArray(int[] nums) {

        int n=nums.length;
        int sum =0;
        int mx=0;

        for(int i =0;i<n;i++){
            sum+=nums[i];
            mx=Math.max(mx,sum);
            if(sum<0) sum=0;
        }
        return mx;
    }

    public static void main(String[] args) {
        int [] n ={5,4,2,-4,-2};
        System.out.println( maxSubArray(n));
    }
}