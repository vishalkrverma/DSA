// User function Template for Java

class Solution {
    String removeReverse(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder(s);
        boolean forward=true;
        int left=0;
        int right=sb.length()-1;
        
        while(left<=right){
            if(forward){
                if(map.get(sb.charAt(left))>1){
                     map.put(sb.charAt(left),map.get(sb.charAt(left))-1);
                    sb.deleteCharAt(left);
                    right--;
                    forward=!forward;
                }
                else{
                    left++;
                }
            }
            else{
                if(map.get(sb.charAt(right))>1){
                    map.put(sb.charAt(right),map.get(sb.charAt(right))-1);
                    sb.deleteCharAt(right);
                    forward=!forward;
                }
                right--;
            }
        }
        return forward?sb.toString():sb.reverse().toString();
    }
}