// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        // code here
        int i=0;
        int j=0;
        String res="";
        
        while(i<S1.length() && j<S2.length()){
            res+=S1.charAt(i);
            res+=S2.charAt(j);
            i++;
            j++;
        }
        while(i<S1.length()){
            res+=S1.charAt(i);
            i++;
        }
        while(j<S2.length()){
            res+=S2.charAt(j);
            j++;
        }
        return res;
    }
}