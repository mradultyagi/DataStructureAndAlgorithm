public class CoinChange {
    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        int[] coins = {1, 2, 3};
        int sum = 4;

        System.out.println(cc.CountWays(coins, coins.length, sum));
        System.out.println(cc.CountWays2(coins, coins.length, sum));
    }
    //Recurssive Solution
    int CountWays(int[] coins,int n ,int s){
        if(s==0){
            return 1;
        }
        if(s<0){
            return 0;
        }
        if(n==0){
            return 0;
        }
        return CountWays(coins,n,s-coins[n-1])+CountWays(coins,n-1,s);
    }
    //DP solution
    int CountWays2(int[] coins,int n ,int s){
        int[][] dp = new int[n+1][s+1];
        for (int i = 0; i <= n; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=s ; j++) {
                dp[i][j]=dp[i-1][j];
                if(coins[i-1]<=j){
                    dp[i][j] +=dp[i][j-coins[i-1]];
                }
            }
        }
        return dp[n][s];
    }
}
