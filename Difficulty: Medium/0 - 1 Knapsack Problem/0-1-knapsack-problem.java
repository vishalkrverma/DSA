class Solution {
    
    public static int knapsackCal(int[] wt,int[] val,int W,int n,int[][] dp){
        
        if(W==0 || n==0) return 0;
        
        if(dp[n][W]!=-1) return dp[n][W];
        
        if(wt[n-1]<=W){
            dp[n][W]=Math.max(val[n-1]+knapsackCal(wt,val,W-wt[n-1],n-1,dp),
             knapsackCal(wt,val,W,n-1,dp));
        }
        else{
           dp[n][W]=knapsackCal(wt,val,W,n-1,dp);
        }
        return dp[n][W];
    }
    
    static int knapsack(int W, int val[], int wt[]) {
        int n=val.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
        Arrays.fill(dp[i], -1);
        }
        return knapsackCal(wt,val,W,n,dp);
    }
}
