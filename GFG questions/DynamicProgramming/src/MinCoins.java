import java.util.Map;

public class MinCoins {
    static void main() {
        int[] coins = {9,6,5,1};
        int a = minCoins(coins,coins.length,9);
        System.out.println(a);
    }
    static int minCoins(int[] coins,int n,int val){
        if(val==0) return 0;
        if (n == 0) return Integer.MAX_VALUE - 1;
        if(coins[n-1]>val) return minCoins(coins,n-1,val);
        int include=1+minCoins(coins,n,val-coins[n-1]);
        int exclude= minCoins(coins,n-1,val);
        return Math.min(include,exclude);

    }
    //DynamicProgramming
    static int minCoinsDP(int[] coins,int n,int val){
        int[] dp = new int[val+1];
        for (int i = 1; i <=val+1; i++) {
            dp[i]=Integer.MAX_VALUE;

        }
        dp[0]=0;
        for (int i = 1; i <=val ; i++) {
            for (int j = 0; j < n; j++) {
                int sub_res=dp[i-dp[j]];
                if(sub_res != Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i],sub_res+1);
            }
        }


        return dp[n];
    }
}
