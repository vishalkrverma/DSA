// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        
        int n=s.length();
        int left=0;
        int max=0;
        int[] ch=new int[26];
        
        for(int i=0;i<n;i++){
            
            int idx=s.charAt(i)-'a';    
                while(ch[idx]>0){
                    ch[s.charAt(left)-'a']--;
                    left++;
                }
                max=Math.max(max,i-left+1);
                ch[s.charAt(i)-'a']++;
            }
        return max;
    }
}