class Solution {
    public static int getMinimumDays(int N, String S, int[] P) {
        // code here
        int cnt=0;
        
        for(int i=1;i<N;i++){
            if(S.charAt(i)==S.charAt(i-1)){
                cnt++;
            }
        }
        char ch[]=S.toCharArray();
        
        int i=0;
        
        while(i<N && cnt!=0){
            
            if(ch[P[i]]!='?'){
            if((P[i]+1)< N && ch[P[i]]==ch[P[i]+1]){
                cnt--;
            }
            if((P[i]-1 )>=0 && ch[P[i]]==ch[P[i]-1]){
                cnt--;
            }
        }
        ch[P[i]]='?';
        i++;
    }
    return i;
    }
}
