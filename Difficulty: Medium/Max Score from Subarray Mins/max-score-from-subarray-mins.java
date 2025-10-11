class Solution {
    public int maxSum(int arr[]) {
        // code here
        int n=arr.length;
        int ans=0;
        
        
        for(int i=1;i<n;i++){
            ans=Math.max(ans,arr[i]+arr[i-1]);
        }
        return ans;
    }
}