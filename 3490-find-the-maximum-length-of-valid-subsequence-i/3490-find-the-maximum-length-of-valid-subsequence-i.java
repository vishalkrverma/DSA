class Solution {
    public int maximumLength(int[] nums) {
        int[][] dp=new int[2][2];
        int ans=0;

        for(int x:nums){
            int p=x%2;
            for(int b=0;b<2;++b){
                dp[p][b]=dp[b][p]+1;
                ans=Math.max(ans,dp[p][b]);
            }
        }
        return ans;
    }
}