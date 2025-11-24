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
}
