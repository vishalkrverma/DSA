class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int n=mat.length;
        int maxSum=0;
        
        int[] row=new int[n];
        int[] col=new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                row[i]+=mat[i][j];
                maxSum=Math.max(row[i],maxSum);
                
                col[j]+=mat[i][j];
                maxSum=Math.max(col[j],maxSum);
            }
        }
        int ans=0;
        
        for(int i=0;i<n;i++){
            row[i]=maxSum-row[i];
            
            ans+=row[i];
        }
        return ans;
    }
}