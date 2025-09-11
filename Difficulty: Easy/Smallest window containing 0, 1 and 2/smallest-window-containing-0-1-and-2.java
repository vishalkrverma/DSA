// User function Template for Java

class Solution {
    public int smallestSubstring(String s) {
        // Code here
        int count=Integer.MAX_VALUE;
        int left=0;
        
        int n=s.length();
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
            while(map.size()==3){
                count=Math.min(count,i-left+1);
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
        }
        return count==Integer.MAX_VALUE ? -1:count;
    }
};
