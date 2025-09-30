// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        char ch[]=s.toCharArray();
        int n=s.length();
        
        Arrays.sort(ch);
        return new String(ch);
    }
}