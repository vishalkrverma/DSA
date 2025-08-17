class Solution {
    public int binarySubstring(String s) {
        // code here
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='1') cnt++;
        }
        return ((cnt)*(cnt-1))/2;
    }
}