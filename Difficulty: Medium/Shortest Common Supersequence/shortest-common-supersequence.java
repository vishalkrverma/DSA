// User function Template for Java

class Solution {

    
    // Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String s1, String s2) {
       
        int n=s1.length();
        int m=s2.length();
        
        int[][] dp=new int[n+1][m+1];
        
        
        for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
               if(s1.charAt(i-1)==s2.charAt(j-1)){
                   dp[i][j]=1+dp[i-1][j-1];
               }
               else{
                   dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               }
           }
       }
        int cnt=dp[n][m];
        return (m+n-cnt);
    }
}