class Solution {
    
    static int helper(String s1,String s2,int i,int j,int[][] dp){
        if(i<0||j<0) return 0;
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=1+helper(s1,s2,i-1,j-1,dp);
        }
        else{
            dp[i][j]=Math.max(helper(s1,s2,i-1,j,dp),helper(s1,s2,i,j-1,dp));
        }
        
        return dp[i][j];
    }
    
    static int lcs(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        
        
        int[][]dp=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return helper(s1,s2,n-1,m-1,dp);
    }
}