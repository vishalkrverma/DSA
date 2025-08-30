// User function Template for Java

class Solution {
    public int smallestSubstring(String s) {
      
        HashMap<Character,Integer> map=new HashMap<>();
        
        int cnt=Integer.MAX_VALUE;
        int j=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.size()==3){
                char temp=s.charAt(j);
                map.put(temp,map.get(temp)-1);
                 cnt=Math.min(cnt,i-j+1);
                
                if(map.get(temp)==0){
                    map.remove(temp);
                }
                j++;
            }
        }
        return cnt==Integer.MAX_VALUE?-1:cnt;
    }
};
