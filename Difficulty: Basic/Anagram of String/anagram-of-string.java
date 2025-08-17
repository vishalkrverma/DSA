/*Complete the function below*/
class GfG {
    public int remAnagrams(String s1, String s2) {
        // add code here.
        int [] ch1=new int[26];
        int [] ch2=new  int[26];
        
        int cnt=0;
        
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            ch1[ch-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            ch2[ch-'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(ch1[i] - ch2[i]);
        }

        return cnt;
    }
}