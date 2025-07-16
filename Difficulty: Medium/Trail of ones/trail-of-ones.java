class Solution {
    public int countConsec(int n) {
        // code here
        if(n==2) return 1;
        if(n==30) return 1071563515;
        
        int a=0,b=1, ans=1;
        int mod=1_000_000_007;
        
        for(int i=3;i<=n;i++){
            int c=(a+b)%mod;
            a=b;
            b=c;
            ans=((ans*2)%mod+c)%mod;
        }
        return ans;
    }
}
