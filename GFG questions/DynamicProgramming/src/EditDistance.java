public class EditDistance {
    public static void main(String[] args){
        String s1 = "saturday";
        String s2 = "sunday";

        System.out.println(editdistance(s1, s2, s1.length(), s2.length()));
        System.out.println(editDistance2(s1,s2,s1.length(),s2.length()));

    }
    static int editdistance(String s,String s2,int m,int n){
        if(m==0) return n;
        if(n==0) return m;
        if(s.charAt(m-1)==s2.charAt(n-1)){
            return editdistance(s,s2,m-1,n-1);
        }
        else return 1+Math.min(editdistance(s,s2,m,n-1),Math.min(editdistance(s,s2,m-1,n),editdistance(s,s2,m-1,n-1)));
    }
    //DP problem
    static int editDistance2(String s1,String s2,int m,int n){
        int [][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n ; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
            }
        }
        return dp[m][n];
    }
}
