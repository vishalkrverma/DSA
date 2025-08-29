
class Solution {
    
    static int subset(int[] arr,int n,int sum){
        int[][]dp=new int[n+1][sum+1];
        
        dp[0][0]=1;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    
    
    int countPartitions(int[] arr, int d) {
        // code here
        int sum=0;
        for(int num:arr) sum+=num;
        
        if(sum<d || (sum+d)%2!=0) return 0;
        
        int s1=(sum+d)/2;
        
        int n=arr.length;
        return subset(arr,n,s1);
    }
}
