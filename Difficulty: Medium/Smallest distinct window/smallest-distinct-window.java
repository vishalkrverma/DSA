// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        int distinct=(int) str.chars().distinct().count();
        
        int n=str.length();
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        int count=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;
        int minStart=0;
        
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            
            if(map.get(ch)==1) count++;
            
            while(count==distinct){
              if(i-start+1<minLen){
                minLen=i-start+1;
                minStart=start;
              }
                char startChar=str.charAt(start);
                
                map.put(startChar,map.get(startChar)-1);
                if(map.get(startChar)==0){
                    count--;
                }
                start++;
            }
        }
        return minLen;
    }
}