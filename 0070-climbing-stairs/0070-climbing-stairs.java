class Solution {
    public int climbStairs(int n) {
       int prev1=0;
       int prev2=1;
       if(n<=1) return n;
       int sum=0;

       for(int i=0;i<n;i++){
          sum=prev1+prev2;
          prev1=prev2;
          prev2=sum;
       }
       return sum;
    }
}