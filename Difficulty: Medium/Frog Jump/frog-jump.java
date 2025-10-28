// User function Template for Java
class Solution {
    
    static int frogJump(int[] height,int n,int[] dp){
        
        if(n==0) return 0;
        
        if(dp[n]!=-1) return dp[n];
        
        int jump1=frogJump(height,n-1,dp)+Math.abs(height[n]-height[n-1]);
        
        int jump2=Integer.MAX_VALUE;
        
        if(n>1){
            jump2=frogJump(height,n-2,dp)+Math.abs(height[n]-height[n-2]);
        }
        return dp[n]=Math.min(jump1,jump2);
    }
    
    int minCost(int[] height) {
        
        int  n=height.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        
        return frogJump(height,n-1,dp);
    }
}