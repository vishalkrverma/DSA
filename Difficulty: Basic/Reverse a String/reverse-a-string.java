// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String str=new String();
        
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }
}