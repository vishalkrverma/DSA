class Solution {
    int countStrings(String s) {
      
     Map<Character,Integer> map=new HashMap<>();
     
     for(char c:s.toCharArray()){
         map.put(c,map.getOrDefault(c,0)+1);
     }
     int ans=0;
     int len=s.length();
     boolean flag=false;
     
     for(char ch:s.toCharArray()){
          if(map.get(ch)>1){
              flag=true;
          }
          ans+=(len-map.get(ch));
     }
     ans/=2;
     ans+=flag?1:0;
     return ans;
    }
}
