class Solution {
    public int cuts(String s) {
        // code here
        int cnt=0;
        int n=s.length();
        
       int[] dp=new int[n+1];
       
       Arrays.fill(dp,-2);
       return helper(s,0,dp);
    }
    
    private int helper(String s,int i, int[] dp){
        if(i==s.length()) return 0;
        if(dp[i]!=-2) return dp[i];
        
        int min=Integer.MAX_VALUE;
        
        for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            
            if(isPowerOfFive(sub)){
                int next=helper(s,j+1,dp);
                
                if(next!=-1){
                    min=Math.min(min,1+next);
                }
            }
        }
        dp[i]=(min==Integer.MAX_VALUE)?-1:min;
        return dp[i];
    }
    
    private boolean isPowerOfFive(String binary){
        if(binary.charAt(0)=='0') return false;
        
        long num=Long.parseLong(binary,2);
        
        if(num==0) return false;
        
        while(num%5==0){
            num/=5;
        }
        return num==1;
    }
}
