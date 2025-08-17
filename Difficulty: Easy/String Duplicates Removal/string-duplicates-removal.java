// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        List<Character> al=new ArrayList<>();
        
        for(char c:s.toCharArray()){
            if(!al.contains(c)) al.add(c);
        }
        String res="";
        for(Character ch:al){
            res+=ch;
        }
        return res;
    }
}
