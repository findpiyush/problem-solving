class Solution {
    public int func(int m, int n, int dp[][])
    {
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int left = func(m,n-1,dp);
        int up = func(m-1,n,dp);
        dp[m][n] = left+up;
        return left+up;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }

        return func(m-1,n-1,dp);
    }
}