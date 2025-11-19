import java.util.Arrays;

public class MinCoins {
    public static void main(String[] args) {
        int [] coins = {5,10,2,1};
        int n = coins.length;
        int amount = 57;
        System.out.println(minimumnumberofcoins(coins,n,amount));

    }
    static int minimumnumberofcoins(int[] coins,int n,int amount){
        Arrays.sort(coins);
        int res=0;
        for (int i = n-1; i >=0; i--) {
            if(coins[i]<=amount){
                int c = amount/coins[i];
                res +=c;
                amount=amount-(c*coins[i]);
            }
            if(amount==0){
                break;
            }
        }
        return res;
    }
}
