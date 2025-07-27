class Solution {
    public int maxProfit(int[] prices) {
        int min=0;
        int n=prices.length;

    int[] left=new int[n];
    int[] right=new int[n];
    right[n-1]=prices[n-1];
    left[0]=prices[0];

    for(int i=1;i<n;i++){
        left[i]=Math.min(left[i-1],prices[i]);
    }
    for(int i=n-2;i>=0;i--){
        right[i]=Math.max(right[i+1],prices[i]);
    }
    for(int i=0;i<n;i++){
        min=Math.max(right[i]-left[i],min);
    }
    return min;
    }
}