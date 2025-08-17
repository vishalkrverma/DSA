class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        Map<Character,Integer> map=new TreeMap<>();
        
        char ans='a';
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            
                int freq=entry.getValue();
                char ch=entry.getKey();
                if(freq>max){
                    max=freq;
                    ans=ch;
                }
        }
        return ans;
    }
}