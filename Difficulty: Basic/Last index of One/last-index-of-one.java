// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        int n=s.length()-1;
        
        for(int i=n;i>=0;i--){
            if(s.charAt(i)=='1') return i;
        }
        return -1;
    }
}