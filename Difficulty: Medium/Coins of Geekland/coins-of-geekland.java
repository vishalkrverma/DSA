class Solution {
    public int Maximum_Sum(int mat[][], int n, int k) {
       int max=Integer.MIN_VALUE;
       int dp[][]=new int[n+1][n+1];
       
       for(int i=0;i<=n;i++){
           for(int j=0;j<=n;j++){
               if(i==0 || j==0) dp[i][j]=0;
               else{
                   dp[i][j]=mat[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
               }
               if(i>=k && j>=k){
                   max=Math.max(dp[i][j]-(dp[i][j-k]+dp[i-k][j]-dp[i-k][j-k]),max);
               }
           }
       }
       return max;
    }
}
