class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str=text.split(" ");
        int n=str.length;
        int cnt=0;

        for(String s:str){
            for(char c:brokenLetters.toCharArray()){
                if(s.indexOf(c)!=-1){
                    cnt++;
                    break;
                }
            }
           
        }
        return n-cnt;
    }
}