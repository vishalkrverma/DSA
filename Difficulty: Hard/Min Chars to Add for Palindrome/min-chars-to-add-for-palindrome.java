class Solution {
    
    static int[] lps(String s){
        int n=s.length();
        
        int i=1;
        int[] lps=new int[n];
        int j=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
                i++;
            }
            else{
                if(j!=0){
                   j=lps[j-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    
    public int minChar(String s) {
        // code here
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "$" + rev;
        int[] lps = lps(combined);
        return s.length() - lps[combined.length() - 1];
    }
}